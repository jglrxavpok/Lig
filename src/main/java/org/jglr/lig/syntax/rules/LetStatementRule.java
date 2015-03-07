package org.jglr.lig.syntax.rules;

import org.jglr.lig.syntax.*;

public class LetStatementRule extends SyntaxRule
{

    public LetStatementRule(Syntax syntax)
    {
        super(syntax);
    }

    @Override
    public boolean conforms(String s)
    {
        String[] parts = trimmedSpaceSplit(s);
        if(parts.length == 4)
        {
            String variable = parts[1];
            String type = parts[3];
            if(parts[0].equals("let"))
            {
                if(syntax().rule("variableName").conforms(variable))
                {
                    if(parts[2].equals("be"))
                    {
                        if(syntax().rule("typeName").conforms(type))
                        {
                            return true;
                        }
                    }
                }
                else
                {
                    System.err.println("invalid variable: " + variable);
                }
            }
        }
        return false;
    }

    @Override
    public int requiredParts()
    {
        return 4;
    }

}
