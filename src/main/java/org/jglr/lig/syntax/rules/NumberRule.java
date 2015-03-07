package org.jglr.lig.syntax.rules;

import org.jglr.lig.syntax.*;

public class NumberRule extends SyntaxRule
{

    public NumberRule(Syntax syntax)
    {
        super(syntax);
    }

    @Override
    public boolean conforms(String s)
    {
        String regex = "[0-9]+";
        return s.matches(regex);
    }

    @Override
    public int requiredParts()
    {
        return 1;
    }

}
