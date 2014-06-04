package jpower.idea.config.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import jpower.idea.config.ConfigFileType;

public class ConfigElementFactory {
    public static ConfigProperty createProperty(Project project, String name) {
        final ConfigFile file = createFile(project, name);
        return (ConfigProperty) file.getFirstChild();
    }

    public static ConfigFile createFile(Project project, String text) {
        String name = "dummy.simple";
        return (ConfigFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, ConfigFileType.INSTANCE, text);
    }
}
