package com.victorp.spring4.annotations.importconfig;

import com.victorp.spring4.annotations.dependency.TextEditorConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author victorp
 */

@Configuration
//@Import(TextEditorConfig.class)
public class ChatWinConfig {

    @Autowired
    private TextEditorConfig textEditorConfig;

    @Bean
    public ChatWindow textEditor(){
        return new ChatWindow( textEditorConfig.spellChecker(),textEditorConfig.textEditor() );
    }


}