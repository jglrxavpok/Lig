package org.jglr.lig.syntax;

import java.util.*;

import com.google.common.collect.*;

public abstract class SyntaxRule
{

    private Syntax syntax;

    public SyntaxRule(Syntax syntax)
    {
        this.syntax = syntax;
    }

    public Syntax syntax()
    {
        return syntax;
    }

    public String[] trimmedSpaceSplit(String s)
    {
        String[] parts = s.split(" ");
        List<String> trimmed = Lists.newArrayList();
        for(String part : parts)
        {
            if(part.isEmpty())
                continue;
            if(part.equals(" "))
            {
                continue;
            }
            trimmed.add(part);
        }
        return trimmed.toArray(new String[0]);
    }

    public abstract boolean conforms(String s);

    public abstract int requiredParts();
}
