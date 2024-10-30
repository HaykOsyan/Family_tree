package oop_hw1;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Operations {

    // Sort people by name
    public static List<Person> sortByName(FamilyTree familyTree) {
        List<Person> sortedList = new ArrayList<>(familyTree.getAllPeople().values());
        sortedList.sort(Comparator.comparing(Person::getName));
        return sortedList;
    }

    // Save the family tree to a file
    public static void saveToFile(FamilyTree familyTree, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(familyTree);
            System.out.println("Family tree saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving family tree: " + e.getMessage());
        }
    }

    // Load the family tree from a file
    public static FamilyTree loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (FamilyTree) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading family tree: " + e.getMessage());
            return null;
        }
    }
}

