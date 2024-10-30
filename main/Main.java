package oop_hw1.main;

import oop_hw1.models.FamilyTree;
import oop_hw1.services.FamilyTreePresenter;
import oop_hw1.services.ConsoleFamilyTreeView;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        ConsoleFamilyTreeView view = new ConsoleFamilyTreeView();
        FamilyTreePresenter presenter = new FamilyTreePresenter(familyTree, view);

        presenter.addPerson("John", "male");
        presenter.addPerson("Mary", "female");
        presenter.addChild("John", "Anna", "female");
        presenter.showAllPeople();
    }
}
