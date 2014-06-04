// This is a generated file. Not intended for manual editing.
package jpower.idea.config.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import jpower.idea.config.psi.ConfigProperty;
import jpower.idea.config.psi.ConfigVisitor;
import org.jetbrains.annotations.NotNull;

public class ConfigPropertyImpl extends ConfigNamedElementImpl implements ConfigProperty {

    public ConfigPropertyImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof ConfigVisitor) ((ConfigVisitor) visitor).visitProperty(this);
        else super.accept(visitor);
    }

    public String getKey() {
        return ConfigPsiImplUtil.getKey(this);
    }

    public String getValue() {
        return ConfigPsiImplUtil.getValue(this);
    }

    public String getName() {
        return ConfigPsiImplUtil.getName(this);
    }

    public PsiElement setName(String newName) {
        return ConfigPsiImplUtil.setName(this, newName);
    }

    public PsiElement getNameIdentifier() {
        return ConfigPsiImplUtil.getNameIdentifier(this);
    }

    public ItemPresentation getPresentation() {
        return ConfigPsiImplUtil.getPresentation(this);
    }

}
