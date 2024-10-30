package oop_hw1.services;

import oop_hw1.models.Person;
import java.util.List;

public interface FamilyTreeView {
    void displayPersonDetails(Person person);
    void displayAllPeople(List<Person> people);
    void displayChildren(List<Person> children);
    void displayMessage(String message);
}
