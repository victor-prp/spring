package com.victorp.spring4.annotations.importconfig;

import com.victorp.spring4.annotations.dependency.TextEditor;
import com.victorp.spring4.annotations.dependency.TextEditorConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author victorp
 */
public class ChatWinApp {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ChatWinConfig.class, TextEditorConfig.class);

        ChatWindow chatWin = ctx.getBean(ChatWindow.class);


        chatWin.spellCheck();

        TextEditor textEditor = chatWin.textEditor();
        textEditor.spellCheck();

        // TextEditor textEditorFromCtx = ctx.getBean(TextEditor.class); throws NoSuchBeanDefinitionException
    }
}
