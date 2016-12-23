package letitbe.parsing;

import antlr.letitbe.LetItBeLexer;
import antlr.letitbe.LetItBeParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Reads the source code and parses it
 */
public class LIBParser {

    private final LetItBeParser parser;

    public LIBParser(InputStream sourceCodeStream) throws IOException {
        LetItBeLexer lexer = new LetItBeLexer(new ANTLRInputStream(sourceCodeStream));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new LetItBeParser(tokens);
    }

    public LIBCodeblock parseCodeblock() {
        LIBCodeblock codeblock = new LIBCodeblock();
        List<LetItBeParser.InstructionContext> instructionContexts = parser.codeblock().instruction();
        for (LetItBeParser.InstructionContext context : instructionContexts) {
            if(context.variableDeclaration() != null) {
                LIBInstruction instruction = createVariableDeclarationInsn(context.variableDeclaration());
                codeblock.appendInstruction(instruction);
            }
        }
        return codeblock;
    }

    private LIBInstruction createVariableDeclarationInsn(LetItBeParser.VariableDeclarationContext context) {
        String name = context.IDENTIFIER(0).getText();
        String type = context.IDENTIFIER(1).getText();
        LIBExpression defaultValue = null;
        if(context.value() != null) {
            defaultValue = createExpression(context.value());
        }
        return new LIBVariableDeclarationInstruction(name, type, defaultValue);
    }

    private LIBExpression createExpression(LetItBeParser.ValueContext value) {
        if(value.integer() != null) {
            int integer = Integer.parseInt(value.integer().getText());
            return new LIBExpression(new LIBConstantInstruction(integer));
        }
        if(value.tuple() != null) {
            LetItBeParser.ValueContext left = value.tuple().value(0);
            LetItBeParser.ValueContext right = value.tuple().value(1);
            LIBExpression leftExpression = createExpression(left);
            LIBExpression rightExpression = createExpression(right);
            return new LIBExpression(new LIBCreateTupleInstruction(leftExpression, rightExpression));
        }
        throw new UnsupportedOperationException();
    }
}
