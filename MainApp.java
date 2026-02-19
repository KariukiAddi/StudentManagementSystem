// Main Application class
public class MainApp {

    public static void main(String[] args) {

        // Create Course objects
        Course course1 = new Course("Object Oriented Software Design Methods", "OOSDM101");
        Course course2 = new Course("Data Structures and Algorithms", "DSA102");

        // Create Student objects
        Student student1 = new Student(1, "Kelvin Kariuki", 95, course1);
        Student student2 = new Student(2, "Grace Adhiambo", 90, course2);
        Student student3 = new Student(3, "Jane wambua", 85, course1);
        Student student4 = new Student(4, "Mutisya Simiyu", 80, course2);
        
        // Display student details
        student1.displayDetails();
        student2.displayDetails();
    }
}
