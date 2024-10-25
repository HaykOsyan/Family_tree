package oop_hw1;
import java.util.List;

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
