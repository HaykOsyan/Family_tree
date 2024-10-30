package oop_hw1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class FamilyTree implements Serializable {
    private static final long serialVersionUID = 1L;  // Add a unique ID for serialization

    private Map<String, Person> people;

    public FamilyTree() {
        this.people = new HashMap<>();
    }

    public void addPerson(String name, String gender) {
        if (!people.containsKey(name)) {
            people.put(name, new Person(name, gender));
        } else {
            System.out.println("Person with name " + name + " already exists.");
        }
    }

    public Person getPerson(String name) {
        return people.get(name);
    }

    public void addChild(String parentName, String childName, String childGender) {
        Person parent = people.get(parentName);
        if (parent != null) {
            Person child = new Person(childName, childGender);
            parent.addChild(child);
            people.put(childName, child);
        } else {
            System.out.println("Parent with name " + parentName + " not found.");
        }
    }

    public Map<String, Person> getAllPeople() {
        return people;
    }
}
