package org.jglr.lig.syntax;

import java.util.*;
import java.util.Map.Entry;

import com.google.common.collect.*;

public class SyntaxDelegatingRule extends SyntaxRule
{

    private Map<String, SyntaxRule> delegates;

    public SyntaxDelegatingRule(Syntax syntax)
    {
        super(syntax);
        delegates = Maps.newHashMap();
    }

    public void addDelegate(String rule)
    {
        delegates.put(rule, syntax().rule(rule));
    }

    @Override
    public boolean conforms(String s)
    {
        return conformingRule(s) != null;
    }

    public String conformingRule(String line)
    {
        for(Entry<String, SyntaxRule> entry : delegates.entrySet())
        {
            if(entry.getValue().conforms(line))
                return entry.getKey();
        }
        return null;
    }

    @Override
    public int requiredParts()
    {
        return -1;
    }

}
