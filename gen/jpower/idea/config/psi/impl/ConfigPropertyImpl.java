// This is a generated file. Not intended for manual editing.
package jpower.idea.config.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import jpower.idea.config.psi.ConfigProperty;
import jpower.idea.config.psi.ConfigVisitor;
import org.jetbrains.annotations.NotNull;

public class ConfigPropertyImpl extends ASTWrapperPsiElement implements ConfigProperty {

    public ConfigPropertyImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof ConfigVisitor) ((ConfigVisitor) visitor).visitProperty(this);
        else super.accept(visitor);
    }

}
