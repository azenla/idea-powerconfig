package jpower.idea.config.psi;

import com.intellij.psi.tree.IElementType;
import jpower.idea.config.ConfigLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ConfigTokenType extends IElementType {
    public ConfigTokenType(@NotNull @NonNls String debugName) {
        super(debugName, ConfigLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "ConfigTokenType." + super.toString();
    }
}
