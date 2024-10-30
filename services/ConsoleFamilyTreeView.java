package oop_hw1.services;

import oop_hw1.models.Person;
import java.util.List;

public class ConsoleFamilyTreeView implements FamilyTreeView {

    @Override
    public void displayPersonDetails(Person person) {
        System.out.println(person != null ? person : "Person not found.");
    }

    @Override
    public void displayAllPeople(List<Person> people) {
        System.out.println("All people in the family tree:");
        for (Person person : people) {
            System.out.println(person);
        }
    }

    @Override
    public void displayChildren(List<Person> children) {
        System.out.println("Children:");
        if (children.isEmpty()) {
            System.out.println("No children found.");
        } else {
            for (Person child : children) {
                System.out.println(child);
            }
        }
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
