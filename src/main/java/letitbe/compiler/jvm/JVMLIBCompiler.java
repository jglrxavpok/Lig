package letitbe.compiler.jvm;

import letitbe.compiler.LIBCompiler;
import letitbe.parsing.*;
import letitbe.types.LIBType;
import letitbe.types.LIBTypeResolver;
import org.objectweb.asm.*;

import java.util.concurrent.atomic.AtomicInteger;

public class JVMLIBCompiler extends LIBCompiler<byte[]> implements Opcodes {

    private ClassWriter writer;

    public JVMLIBCompiler(LIBTypeResolver typeResolver) {
        super(typeResolver);
    }

    @Override
    public byte[] compile(LIBCodeblock codeblock) {
        writer = new ClassWriter(0);

        // class header
        String name = "LIBEntryPoint";
        String type = "L"+name+";";
        writer.visit(V1_8, ACC_PUBLIC, name, null, "java/lang/Object", null);

        MethodVisitor main = writer.visitMethod(ACC_PUBLIC | ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
        main.visitCode();
        Label start = new Label();
        Label end = new Label();
        main.visitLocalVariable("args", "[Ljava/lang/String;", null, start, end, 0);
        main.visitLabel(start);
        main.visitTypeInsn(NEW, type);
        main.visitMethodInsn(INVOKESPECIAL, type, "<init>", "()V", false);
        main.visitInsn(RETURN);
        main.visitLabel(end);
        main.visitMaxs(0, 1);
        main.visitEnd();

        start = new Label();
        end = new Label();
        MethodVisitor constructor = writer.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
        constructor.visitCode();
        constructor.visitLabel(start);
        compileMethod(constructor, type, codeblock, start, end);
        constructor.visitInsn(RETURN);
        constructor.visitLabel(end);
        constructor.visitMaxs(1, 4);
        constructor.visitEnd();
        return writer.toByteArray();
    }

    private void compileMethod(MethodVisitor visitor, String ownerType, LIBCodeblock codeblock, Label start, Label end) {
        int localIndex = 1; // 0 is 'this'
        visitor.visitLocalVariable("this", ownerType, null, start, end, 0);
        AtomicInteger local = new AtomicInteger(localIndex);
        compileExpression(visitor, codeblock, local, start, end);
    }

    private void compileExpression(MethodVisitor visitor, LIBExpression expression, AtomicInteger local, Label expressionStart, Label expressionEnd) {
        for(LIBInstruction instruction : expression.getInstructions()) {
            if(instruction instanceof LIBVariableDeclarationInstruction) {
                LIBVariableDeclarationInstruction var = ((LIBVariableDeclarationInstruction) instruction);
                variableDeclaration(var, visitor, local, expressionStart, expressionEnd);
            } else if (instruction instanceof LIBConstantInstruction) {
                LIBConstantInstruction constant = ((LIBConstantInstruction) instruction);
                visitor.visitLdcInsn(constant.getValue());
            } else if (instruction instanceof LIBLineNumberInstruction) {
                Label start = new Label();
                visitor.visitLabel(start);
                visitor.visitLineNumber(((LIBLineNumberInstruction) instruction).getLine(), start);
            } else {
                System.err.println("Unsupported instruction: "+instruction);
            }
        }
    }

    private void variableDeclaration(LIBVariableDeclarationInstruction var, MethodVisitor visitor, AtomicInteger local, Label start, Label end) {
        String name = var.getVariableName();
        String typeName = var.getVariableType();
        Type type = toJVMType(typeResolver.getTypeIdentifier(typeName));

        int varIndex = local.getAndIncrement();
        visitor.visitLocalVariable(name, type.getDescriptor(), null, start, end, varIndex);
        if(type.getDescriptor().equals("D") || type.getDescriptor().equals("J")) {
            local.incrementAndGet(); // Long and double types take two slots
        }

        if(var.getDefaultValue() != null) {
            LIBExpression expression1 = var.getDefaultValue();
            compileExpression(visitor, expression1, local, start, end);
            visitor.visitVarInsn(type.getOpcode(ISTORE), varIndex);
        }
    }

    private Type toJVMType(LIBType libType) {
        if(LIBType.INTEGER.equals(libType)) {
            return Type.LONG_TYPE;
        }
        if(LIBType.NATURAL.equals(libType)) {
            return Type.LONG_TYPE;
        }
        if(LIBType.RATIONAL.equals(libType)) {
            return Type.DOUBLE_TYPE;
        }
        if(LIBType.REAL.equals(libType)) {
            return Type.DOUBLE_TYPE;
        }
        return Type.getType(libType.getName());
    }

}
