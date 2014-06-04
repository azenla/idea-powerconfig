package jpower.idea.config;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;

public class ConfigCodeStyleSettings extends CustomCodeStyleSettings {
    public ConfigCodeStyleSettings(CodeStyleSettings settings) {
        super("ConfigCodeStyleSettings", settings);
    }
}
