package jpower.idea.config;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.psi.PsiFile;
import jpower.idea.config.psi.ConfigFile;
import org.jetbrains.annotations.NotNull;

public class ConfigStructureViewModel extends StructureViewModelBase implements
        StructureViewModel.ElementInfoProvider {
    public ConfigStructureViewModel(PsiFile psiFile) {
        super(psiFile, new ConfigStructureViewElement(psiFile));
    }

    @NotNull
    public Sorter[] getSorters() {
        return new Sorter[]{Sorter.ALPHA_SORTER};
    }


    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return element instanceof ConfigFile;
    }
}
