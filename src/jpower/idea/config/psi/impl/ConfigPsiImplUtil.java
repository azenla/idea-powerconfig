package jpower.idea.config.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import jpower.idea.config.ConfigIcons;
import jpower.idea.config.psi.ConfigElementFactory;
import jpower.idea.config.psi.ConfigProperty;
import jpower.idea.config.psi.ConfigTypes;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ConfigPsiImplUtil {
    public static String getKey(ConfigProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(ConfigTypes.KEY);
        if (keyNode != null) {
            return keyNode.getText();
        } else {
            return null;
        }
    }

    public static String getValue(ConfigProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(ConfigTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }


    public static String getName(ConfigProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(ConfigProperty element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(ConfigTypes.KEY);
        if (keyNode != null) {

            ConfigProperty property = ConfigElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(ConfigProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(ConfigTypes.KEY);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }


    public static ItemPresentation getPresentation(final ConfigProperty element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getKey();
            }

            @Nullable
            @Override
            public String getLocationString() {
                if (element.getParent() == null) {
                    return "unknown";
                }
                return element.getContainingFile().getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return ConfigIcons.FILE;
            }
        };
    }
}
