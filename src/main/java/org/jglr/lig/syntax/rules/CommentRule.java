package org.jglr.lig.syntax.rules;

import org.jglr.lig.syntax.*;

public class CommentRule extends SyntaxRule
{

    public CommentRule(Syntax syntax)
    {
        super(syntax);
    }

    @Override
    public boolean conforms(String s)
    {
        return s.startsWith(";");
    }

    @Override
    public int requiredParts()
    {
        return 1;
    }

}
