package com.victorp.spring4.annotations.importconfig;

import com.victorp.spring4.annotations.dependency.SpellChecker;
import com.victorp.spring4.annotations.dependency.TextEditor;

/**
 * @author victorp
 */
public class ChatWindow {
    private final SpellChecker spellChecker;
    private final TextEditor textEditor;

    public ChatWindow(SpellChecker spellChecker, TextEditor textEditor) {
        this.spellChecker = spellChecker;
        this.textEditor = textEditor;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }

    public TextEditor textEditor() {
        return textEditor;
    }
}
