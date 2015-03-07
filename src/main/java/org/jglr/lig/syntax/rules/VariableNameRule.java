package org.jglr.lig.syntax.rules;

import org.jglr.lig.syntax.*;

public class VariableNameRule extends SyntaxRule
{

    public VariableNameRule(Syntax syntax)
    {
        super(syntax);
    }

    @Override
    public boolean conforms(String s)
    {
        String regex = "([a-z]|[A-Z]|d|_|$|€|£)+";
        return s.matches(regex);
    }

    @Override
    public int requiredParts()
    {
        return 1;
    }

}
