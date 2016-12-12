package com.victorp.spring4.annotations.dependency;

/**
 * @author victorp
 */
public class SpellChecker {
    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor." );
    }

    public void checkSpelling(){
        System.out.println("Inside checkSpelling." );
    }

}