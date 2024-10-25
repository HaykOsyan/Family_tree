package oop_hw1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person {
    private String name;
    private String gender;  // "male" or "female"
    private List<Person> children;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', gender='" + gender + "'}";
    }
}

class FamilyTree {
    private Map<String, Person> people;

    public FamilyTree() {
        this.people = new HashMap<>();
    }

    // Добавление человека в древо
    public void addPerson(String name, String gender) {
        if (!people.containsKey(name)) {
            people.put(name, new Person(name, gender));
        } else {
            System.out.println(name + " already exists in the family tree.");
        }
    }

    // Добавление ребенка к родителю
    public void addChild(String parentName, String childName, String childGender) {
        Person parent = people.get(parentName);
        if (parent != null) {
            Person child = new Person(childName, childGender);
            parent.addChild(child);
            people.put(childName, child); // добавляем ребенка в общую базу
        } else {
            System.out.println("Parent " + parentName + " not found in the tree.");
        }
    }

    // Получение человека по имени
    public Person getPerson(String name) {
        return people.get(name);
    }
}

class Research {
    private FamilyTree familyTree;

    public Research(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    // Метод для получения детей определенного человека
    public List<Person> getChildrenOf(String personName) {
        Person person = familyTree.getPerson(personName);
        if (person != null) {
            return person.getChildren();
        } else {
            System.out.println("Person " + personName + " not found.");
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        

    }
}

