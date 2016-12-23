import letitbe.compiler.jvm.JVMLIBCompiler;
import letitbe.parsing.LIBCodeblock;
import letitbe.parsing.LIBParser;
import letitbe.typeresolving.LIBTypeResolver;
import org.junit.Test;
import org.objectweb.asm.ClassReader;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestJVMCompiler {

    @Test
    public void simpleClass() throws IOException {
        JVMLIBCompiler compiler = new JVMLIBCompiler(new LIBTypeResolver() {
            @Override
            public String getTypeIdentifier(String typeName) {
                return "I";
            }
        });
        LIBParser parser = new LIBParser(new ByteArrayInputStream("Let myvar be an integer equal to 50.".getBytes()));
        LIBCodeblock block = parser.parseCodeblock();
        byte[] bytes = compiler.compile(block);

        ClassReader reader = new ClassReader(bytes);
        assertEquals("LIBEntryPoint", reader.getClassName());

        FileOutputStream outputStream = new FileOutputStream("./runtime/LIBEntryPoint.class");
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();
    }
}
