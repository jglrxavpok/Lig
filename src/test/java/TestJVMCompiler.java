import letitbe.compiler.jvm.JVMLIBCompiler;
import letitbe.parsing.LIBCodeblock;
import letitbe.parsing.LIBParser;
import letitbe.types.LIBType;
import letitbe.types.LIBTypeResolver;
import org.junit.Test;
import org.objectweb.asm.ClassReader;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class TestJVMCompiler {

    @Test
    public void simpleClass() throws IOException {
        JVMLIBCompiler compiler = new JVMLIBCompiler(new LIBTypeResolver() {
            @Override
            public LIBType getTypeIdentifier(String typeName) {
                switch (typeName.toLowerCase()) {
                    case "integer":
                        return LIBType.INTEGER;
                    case "natural":
                        return LIBType.NATURAL;
                    case "rational":
                        return LIBType.RATIONAL;
                    case "real":
                        return LIBType.REAL;
                }
                return LIBType.INTEGER;
            }
        });
        LIBParser parser = new LIBParser(new ByteArrayInputStream(("Let myvar be an integer equal to 50.\n" +
                "Let r be a real set to 900. Let q be a rational equal to 50.").getBytes()));
        LIBCodeblock block = parser.parseCodeblock();
        byte[] bytes = compiler.compile(block);

        ClassReader reader = new ClassReader(bytes);
        assertEquals("LIBEntryPoint", reader.getClassName());

        FileOutputStream outputStream = new FileOutputStream("./runtime/LIBEntryPoint.class");
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();

        loadClass(bytes, "LIBEntryPoint"); // tests loading
    }

    // From ASM website: http://asm.ow2.org/doc/faq.html#Q5
    private Class loadClass(byte[] b, String className) {
        //override classDefine (as it is protected) and define the class.
        Class clazz = null;
        try {
            ClassLoader loader = ClassLoader.getSystemClassLoader();
            Class cls = Class.forName("java.lang.ClassLoader");
            Method method = cls.getDeclaredMethod("defineClass", String.class, byte[].class, int.class, int.class);

            // protected method invocaton
            method.setAccessible(true);
            try {
                Object[] args = new Object[] { className, b, new Integer(0), new Integer(b.length)};
                clazz = (Class) method.invoke(loader, args);
            } finally {
                method.setAccessible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        return clazz;
    }
}
