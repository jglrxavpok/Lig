package org.jglr.lig.syntax.rules;

import org.jglr.lig.syntax.*;

public class KeywordRule extends SyntaxRule
{

    private String keyword;

    public KeywordRule(Syntax syntax, String keyword)
    {
        super(syntax);
        this.keyword = keyword;
    }

    @Override
    public boolean conforms(String s)
    {
        return keyword.equals(s);
    }

    @Override
    public int requiredParts()
    {
        return 1;
    }

}
