import letitbe.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestParser {

    @Test
    public void singleVarDeclaration() throws IOException {
        FirstStageParser parser = new FirstStageParser(new ByteArrayInputStream("Let myvar be an integer.".getBytes()));
        LIBCodeblock block = parser.parseCodeblock();
        assertEquals(1, block.getInstructions().size());
        assertTrue(block.getInstructions().get(0) instanceof LIBVariableDeclarationInstruction);
        LIBVariableDeclarationInstruction insn = (LIBVariableDeclarationInstruction) block.getInstructions().get(0);
        assertEquals("myvar", insn.getVariableName());
        assertEquals("integer", insn.getVariableType());
        assertEquals(null, insn.getDefaultValue());
    }

    @Test
    public void singleVarDeclarationWithDefaultValue() throws IOException {
        FirstStageParser parser = new FirstStageParser(new ByteArrayInputStream("Let myvar be an integer equal to 50".getBytes()));
        LIBCodeblock block = parser.parseCodeblock();
        assertEquals(1, block.getInstructions().size());
        assertTrue(block.getInstructions().get(0) instanceof LIBVariableDeclarationInstruction);
        LIBVariableDeclarationInstruction insn = (LIBVariableDeclarationInstruction) block.getInstructions().get(0);
        assertEquals("myvar", insn.getVariableName());
        assertEquals("integer", insn.getVariableType());
        assertEquals(new LIBExpression(new LIBConstantInstruction(50)), insn.getDefaultValue());
    }

    @Test
    public void singleVarDeclarationWithDefaultTupleValue() throws IOException {
        FirstStageParser parser = new FirstStageParser(new ByteArrayInputStream("Let myvar be a StrangeTuple equal to (50, (5, 9))".getBytes()));
        LIBCodeblock block = parser.parseCodeblock();
        assertEquals(1, block.getInstructions().size());
        assertTrue(block.getInstructions().get(0) instanceof LIBVariableDeclarationInstruction);
        LIBVariableDeclarationInstruction insn = (LIBVariableDeclarationInstruction) block.getInstructions().get(0);
        assertEquals("myvar", insn.getVariableName());
        assertEquals("StrangeTuple", insn.getVariableType());

        LIBExpression left = new LIBExpression(new LIBConstantInstruction(50));
        LIBExpression tupleRightFirst = new LIBExpression(new LIBConstantInstruction(5));
        LIBExpression tupleRightSecond = new LIBExpression(new LIBConstantInstruction(9));
        LIBExpression right = new LIBExpression(new LIBCreateTupleInstruction(tupleRightFirst, tupleRightSecond));
        assertEquals(new LIBExpression(new LIBCreateTupleInstruction(left, right)), insn.getDefaultValue());
    }
}
