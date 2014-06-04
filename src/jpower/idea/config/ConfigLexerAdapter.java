package jpower.idea.config;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class ConfigLexerAdapter extends FlexAdapter {
    public ConfigLexerAdapter() {
        super(new ConfigLexer((Reader) null));
    }
}
