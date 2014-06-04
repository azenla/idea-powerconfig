package jpower.idea.config;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ConfigFileType extends LanguageFileType {
    public static final ConfigFileType INSTANCE = new ConfigFileType();

    protected ConfigFileType() {
        super(ConfigLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "PowerConfig File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "JPower Configuration File";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cfg";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ConfigIcons.FILE;
    }
}
