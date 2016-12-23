package letitbe.compiler.jvm;

import letitbe.compiler.LIBCompiler;
import letitbe.parsing.*;
import letitbe.typeresolving.LIBTypeResolver;
import org.objectweb.asm.*;

public class JVMLIBCompiler extends LIBCompiler<byte[]> implements Opcodes {

    private ClassWriter writer;

    public JVMLIBCompiler(LIBTypeResolver typeResolver) {
        super(typeResolver);
    }

    @Override
    public byte[] compile(LIBCodeblock codeblock) {
        writer = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

        // class header
        String name = "LIBEntryPoint";
        String type = "L"+name+";";
        writer.visit(V1_8, ACC_PUBLIC, name, null, null, null);

        MethodVisitor main = writer.visitMethod(ACC_PUBLIC | ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
        main.visitCode();
        main.visitTypeInsn(NEW, type);
        main.visitMethodInsn(INVOKESPECIAL, type, "<init>", "()V", false);
        main.visitMaxs(0, 0);
        main.visitEnd();

        MethodVisitor constructor = writer.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
        compileMethod(constructor, codeblock);
        return writer.toByteArray();
    }

    private void compileMethod(MethodVisitor visitor, LIBCodeblock codeblock) {
        visitor.visitCode();
        int localIndex = 1; // 0 is 'this'
        compileExpression(visitor, codeblock, localIndex);
        visitor.visitMaxs(0, 0);
        visitor.visitEnd();
    }

    private void compileExpression(MethodVisitor visitor, LIBExpression expression, int localIndex) {
        for(LIBInstruction instruction : expression.getInstructions()) {
            if(instruction instanceof LIBVariableDeclarationInstruction) {
                LIBVariableDeclarationInstruction var = ((LIBVariableDeclarationInstruction) instruction);
                String name = var.getVariableName();
                String typeName = var.getVariableType();
                Type type = Type.getType(typeResolver.getTypeIdentifier(typeName));

                int varIndex = localIndex++;
                visitor.visitLocalVariable(name, type.getDescriptor(), null, new Label(), new Label(), varIndex);

                if(var.getDefaultValue() != null) {
                    LIBExpression expression1 = var.getDefaultValue();
                    compileExpression(visitor, expression1, localIndex);
                    visitor.visitVarInsn(ISTORE, varIndex); // TODO: other than ISTORE
                }
            } else if (instruction instanceof LIBConstantInstruction) {
                LIBConstantInstruction constant = ((LIBConstantInstruction) instruction);
                visitor.visitLdcInsn(constant.getValue());
            }
        }
    }

}
