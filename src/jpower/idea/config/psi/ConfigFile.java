package jpower.idea.config.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import jpower.idea.config.ConfigFileType;
import jpower.idea.config.ConfigLanguage;
import org.jetbrains.annotations.NotNull;

public class ConfigFile extends PsiFileBase {
    public ConfigFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ConfigLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return ConfigFileType.INSTANCE;
    }
}
