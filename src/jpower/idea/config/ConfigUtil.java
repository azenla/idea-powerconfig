package jpower.idea.config;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import jpower.idea.config.psi.ConfigFile;
import jpower.idea.config.psi.ConfigProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ConfigUtil {
    public static List<ConfigProperty> findProperties(Project project, String key) {
        List<ConfigProperty> result = null;
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, ConfigFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            ConfigFile ConfigFile = (ConfigFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (ConfigFile != null) {
                ConfigProperty[] properties = PsiTreeUtil.getChildrenOfType(ConfigFile, ConfigProperty.class);
                if (properties != null) {
                    for (ConfigProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            if (result == null) {
                                result = new ArrayList<ConfigProperty>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<ConfigProperty>emptyList();
    }

    public static List<ConfigProperty> findProperties(Project project) {
        List<ConfigProperty> result = new ArrayList<ConfigProperty>();
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, ConfigFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            ConfigFile ConfigFile = (ConfigFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (ConfigFile != null) {
                ConfigProperty[] properties = PsiTreeUtil.getChildrenOfType(ConfigFile, ConfigProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }


}
