package oop_hw1;
import java.util.ArrayList;
import java.util.List;

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
