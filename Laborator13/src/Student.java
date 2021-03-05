import java.util.ArrayList;

public class Student extends User {
    private Parent mother;
    private Parent father;
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setMother(Parent mother) {
        this.mother = mother;
    }

    public void setFather(Parent father) {
        this.father = father;
    }

    public boolean isParent(Observer parent) {
        if (mother == parent || father == parent)
            return true;
        return false;
    }
}
