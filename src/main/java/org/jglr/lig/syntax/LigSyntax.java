package org.jglr.lig.syntax;

import org.jglr.lig.syntax.rules.*;

public class LigSyntax extends Syntax
{

    @Override
    public void init()
    {
        rule("comment", new CommentRule(this));
        rule("variableName", new VariableNameRule(this));
        rule("typeName", new VariableNameRule(this)); // TODO: more specific rule ?
        rule("letStatement", new LetStatementRule(this));
        rule("number", new NumberRule(this));
        rule("point", new TextRule(this, "'(' number ',' number ')'"));
        rule("value", new TextRule(this, "variableName | number | point"));
        rule("add", new TextRule(this, "value '+' value"));
        rule("assign", new TextRule(this, "variableName 'is' value"));
        rule("letStatementAndAssign", new TextRule(this, "letStatement 'as' value"));
        statementRule().addDelegate("comment");
        statementRule().addDelegate("letStatement");
        statementRule().addDelegate("letStatementAndAssign");
        statementRule().addDelegate("assign");
    }
}
