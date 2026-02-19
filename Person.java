// Abstract class demonstrating Abstraction
public abstract class Person {

    protected String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter and Setter (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void displayDetails();
}
