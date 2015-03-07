package org.jglr.lig;

import java.io.*;
import java.util.*;

public class LigTest
{

    public static void main(String[] args) throws IOException
    {
        LigParser parser = new LigParser();
        String s = readTest();
        Collection<LigToken> tokens = parser.parse(s);
        for(LigToken token : tokens)
        {
            System.out.println(token.raw());
        }
    }

    private static String readTest() throws IOException
    {
        byte[] buffer = new byte[4096];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int i;
        InputStream in = LigTest.class.getResourceAsStream("/test.lig");
        while((i = in.read(buffer)) != -1)
        {
            baos.write(buffer, 0, i);
        }
        baos.flush();
        baos.close();
        return new String(baos.toByteArray(), "UTF-8");
    }
}
