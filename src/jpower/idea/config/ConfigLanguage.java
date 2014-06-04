package jpower.idea.config;

import com.intellij.lang.Language;

public class ConfigLanguage extends Language {
    public static final ConfigLanguage INSTANCE = new ConfigLanguage();

    protected ConfigLanguage() {
        super("PowerConfig");
    }
}
