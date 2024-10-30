package oop_hw1.services;

import oop_hw1.models.FamilyTree;
import oop_hw1.models.Person;
import java.util.List;
import java.util.ArrayList;

public class FamilyTreePresenter {
    private FamilyTree familyTree;
    private FamilyTreeView view;

    public FamilyTreePresenter(FamilyTree familyTree, FamilyTreeView view) {
        this.familyTree = familyTree;
        this.view = view;
    }

    public void addPerson(String name, String gender) {
        familyTree.addPerson(name, gender);
        view.displayMessage("Added person: " + name);
    }

    public void addChild(String parentName, String childName, String childGender) {
        Person parent = familyTree.getPerson(parentName);
        if (parent != null) {
            Person child = new Person(childName, childGender);
            parent.addChild(child);
            familyTree.getAllPeople().put(childName, child);
            view.displayMessage("Added child " + childName + " to parent " + parentName);
        } else {
            view.displayMessage("Parent not found.");
        }
    }

    public void showAllPeople() {
        List<Person> peopleList = new ArrayList<>(familyTree.getAllPeople().values());
        view.displayAllPeople(peopleList);
    }
}
