package oop_hw1.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class FamilyTree implements Serializable {
    private Map<String, Person> people = new HashMap<>();

    public void addPerson(String name, String gender) {
        if (!people.containsKey(name)) {
            people.put(name, new Person(name, gender));
        }
    }

    public Person getPerson(String name) {
        return people.get(name);
    }

    public Map<String, Person> getAllPeople() {
        return people;
    }
}
