package jpower.idea.config;

import com.intellij.navigation.ChooseByNameContributor;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import jpower.idea.config.psi.ConfigProperty;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ConfigChooseByNameContributor implements ChooseByNameContributor {
    @NotNull
    @Override
    public String[] getNames(Project project, boolean includeNonProjectItems) {
        List<ConfigProperty> properties = ConfigUtil.findProperties(project);
        List<String> names = new ArrayList<String>(properties.size());
        for (ConfigProperty property : properties) {
            if (property.getKey() != null && property.getKey().length() > 0) {
                names.add(property.getKey());
            }
        }
        return names.toArray(new String[names.size()]);
    }

    @NotNull
    @Override
    public NavigationItem[] getItemsByName(String name, String pattern, Project project, boolean includeNonProjectItems) {
        List<ConfigProperty> properties = ConfigUtil.findProperties(project, name);
        //noinspection SuspiciousToArrayCall
        return properties.toArray(new NavigationItem[properties.size()]);
    }
}
