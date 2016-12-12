package com.victorp.spring4.annotations.dependency;

/**
 * @author victorp
 */
public class WebPage {
    private SpellChecker spellChecker;

    public WebPage(SpellChecker spellChecker) {
        System.out.println("Inside WebPage constructor." );
        this.spellChecker = spellChecker;
    }


    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}

