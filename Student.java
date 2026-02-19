// Student class inherits from Person
public class Student extends Person {

    private int studentId;
    private int marks;
    private Course course;

    // Constructor
    public Student(int studentId, String name, int marks, Course course) {
        super(name); // calling parent constructor
        this.studentId = studentId;
        this.marks = marks;
        this.course = course;
    }

    // Getters and Setters (Encapsulation)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to calculate grade
    public String calculateGrade() {
        if (marks >= 80)
            return "A";
        else if (marks >= 60)
            return "B";
        else if (marks >= 50)
            return "C";
        else
            return "Fail";
    }

    // Method Overriding (Polymorphism)
    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
        course.displayCourse();
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("----------------------------");
    }
}
