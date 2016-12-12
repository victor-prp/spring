package com.victorp.spring4.annotations.dependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author victorp
 */
@Configuration
public class TextEditorConfig {

    @Bean
    public TextEditor textEditor(){
        return new TextEditor( spellChecker() );
    }

    @Bean
    public WebPage webPage(){
        return new WebPage( spellChecker() );
    }


    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}