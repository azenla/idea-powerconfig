package jpower.idea.config.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import jpower.idea.config.psi.ConfigNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class ConfigNamedElementImpl extends ASTWrapperPsiElement implements ConfigNamedElement {
    public ConfigNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
