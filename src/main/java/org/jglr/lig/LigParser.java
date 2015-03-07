package org.jglr.lig;

import java.util.*;

import com.google.common.collect.*;

import org.jglr.lig.syntax.*;

public class LigParser
{

    public Collection<LigToken> parse(String s)
    {
        Syntax syntax = new LigSyntax();
        List<LigToken> tokens = Lists.newArrayList();
        String[] lines = s.split("\n");
        for(String line : lines)
        {
            if(!syntax.statementRule().conforms(line))
            {
                System.err.println("Invalid line: " + line);
            }
            else
            {
                String rule = syntax.statementRule().conformingRule(line);
                System.out.println(rule);
            }
        }
        return tokens;
    }

}
