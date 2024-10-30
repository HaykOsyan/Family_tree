package oop_hw1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        familyTree.addPerson("John", "male");
        familyTree.addPerson("Mary", "female");
        familyTree.addChild("John", "Anna", "female");

        List<Person> sortedPeople = Operations.sortByName(familyTree);
        System.out.println("Sorted people: " + sortedPeople);

        // Save to file
        Operations.saveToFile(familyTree, "familyTree.dat");

        // Load from file
        FamilyTree loadedFamilyTree = Operations.loadFromFile("familyTree.dat");
        if (loadedFamilyTree != null) {
            System.out.println("Loaded family tree: " + loadedFamilyTree.getAllPeople());
        } else {
            System.out.println("Failed to load family tree.");
        }
    }
}


