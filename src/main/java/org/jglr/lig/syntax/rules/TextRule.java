package org.jglr.lig.syntax.rules;

import java.util.*;

import com.google.common.collect.*;

import org.jglr.lig.syntax.*;

public class TextRule extends SyntaxRule
{

    private List<List<SyntaxRule>> ruleOptions;

    public TextRule(Syntax syntax, String rule)
    {
        super(syntax);
        parse(rule);
    }

    private void parse(String rule)
    {
        String[] options = rule.split("\\|");
        ruleOptions = Lists.newArrayList();
        for(String option : options)
        {
            String[] parts = trimmedSpaceSplit(option);
            String rawRegex = "'.+'";
            List<SyntaxRule> subRules = Lists.newArrayList();
            for(String current : parts)
            {
                if(current.matches(rawRegex))
                {
                    subRules.add(new KeywordRule(syntax(), current.substring(1, current.length() - 1)));
                }
                else
                {
                    SyntaxRule ruleDef = syntax().rule(current);
                    if(ruleDef == null)
                    {
                        throw new NullPointerException("Rule " + current + " does not exist");
                    }
                    subRules.add(ruleDef);
                }
            }
            ruleOptions.add(subRules);
        }
    }

    @Override
    public boolean conforms(String s)
    {
        options: for(List<SyntaxRule> option : ruleOptions)
        {
            String[] parts = trimmedSpaceSplit(s);
            int index = 0;
            for(int i = 0; i < option.size(); i++ )
            {
                SyntaxRule rule = option.get(i);
                if(rule == null)
                    continue;
                String content = sum(parts, index, rule.requiredParts());
                if(content == null) // too short
                    continue options;
                if(!rule.conforms(content))
                    continue options;
                if(rule.requiredParts() == -1)
                    index++ ;
                else
                    index += rule.requiredParts();
            }
            if(index != parts.length)
                continue options;
            return true;
        }
        return false;
    }

    private String sum(String[] parts, int index, int requiredParts)
    {
        if(index >= parts.length)
            return null;
        if(requiredParts == -1)
            return parts[index];
        String joined = "";
        for(int i = index; i < requiredParts + index; i++ )
        {
            if(i >= parts.length)
                return null;
            if(i != index)
                joined += " ";
            joined += parts[i];
        }
        return joined;
    }

    @Override
    public int requiredParts()
    {
        return -1;
    }

}
