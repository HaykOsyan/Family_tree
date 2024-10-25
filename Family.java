package oop_hw1;
import java.util.Map;
import java.util.HashMap;

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
