// This is a generated file. Not intended for manual editing.
package jpower.idea.config.psi;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;

public interface ConfigProperty extends ConfigNamedElement {

    String getKey();

    String getValue();

    String getName();

    PsiElement setName(String newName);

    PsiElement getNameIdentifier();

    ItemPresentation getPresentation();

}
