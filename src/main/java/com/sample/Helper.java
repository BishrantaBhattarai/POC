package com.sample;


import org.drools.core.rule.consequence.KnowledgeHelper;

/**
 *Helper class to see which rule got triggered in the sample application
 * @author vivek
 */


public class Helper {
	
	public static void help(final KnowledgeHelper drools, final String message){
        System.out.print(message);
        System.out.print("\nrule triggered: " + drools.getRule().getName());
    }
    
    public static void helper(final KnowledgeHelper drools){
        System.out.print("\nrule triggered: " + drools.getRule().getName());
    }


}
