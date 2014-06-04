// This is a generated file. Not intended for manual editing.
package jpower.idea.config.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import jpower.idea.config.psi.impl.ConfigPropertyImpl;

public interface ConfigTypes {

    IElementType PROPERTY = new ConfigElementType("PROPERTY");

    IElementType COMMENT = new ConfigTokenType("COMMENT");
    IElementType CRLF = new ConfigTokenType("CRLF");
    IElementType KEY = new ConfigTokenType("KEY");
    IElementType SEPARATOR = new ConfigTokenType("SEPARATOR");
    IElementType VALUE = new ConfigTokenType("VALUE");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == PROPERTY) {
                return new ConfigPropertyImpl(node);
            }
            throw new AssertionError("Unknown element type: " + type);
        }
    }
}
