// Main Application class
public class MainApp {

    public static void main(String[] args) {

        // Create Course objects
        Course course1 = new Course("Object Oriented Programming", "OOP101");
        Course course2 = new Course("Data Structures", "DS102");

        // Create Student objects
        Student student1 = new Student(1, "Kelvin Kariuki", 75, course1);
        Student student2 = new Student(2, "Grace Wanjiku", 62, course2);

        // Display student details
        student1.displayDetails();
        student2.displayDetails();
    }
}
