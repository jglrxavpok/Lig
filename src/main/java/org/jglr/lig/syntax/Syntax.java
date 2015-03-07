package org.jglr.lig.syntax;

import java.util.*;

import com.google.common.collect.*;

public abstract class Syntax
{
    private SyntaxDelegatingRule          statementRule;
    private HashMap<String, SyntaxRule> rules;

    public Syntax()
    {
        rules = Maps.newHashMap();
        statementRule = new SyntaxDelegatingRule(this);
        rules.put("statement", statementRule);

        init();
    }

    public abstract void init();

    public SyntaxDelegatingRule statementRule()
    {
        return statementRule;
    }

    public SyntaxRule rule(String name)
    {
        return rules.get(name);
    }

    public void rule(String name, SyntaxRule rule)
    {
        rules.put(name, rule);
    }

    public boolean isStatement(String line)
    {
        return statementRule.conforms(line);
    }
}
