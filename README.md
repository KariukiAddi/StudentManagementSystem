# 📘 Student Management System

### Object Oriented Software Design Methods – Project-Based CAT

**Developer Name:** Kelvin Ngige Kariuki
**Registration Number** BCS-03-0039/2026
**Course Unit:** Object Oriented Software Design Methods
**Language Used:** Java

# Project Title
**Design and Implementation of a Simple Object-Oriented Student Management System**

# Project Description
This project involves the design and implementation of a Simple Student Management System using Java and core Object-Oriented Programming principles. The system enables the creation of student objects linked to specific courses, captures key details such as Student ID, Name, Course information, and Marks, and automatically calculates grades based on defined criteria. It is structured into four main classes: an abstract Person superclass, a Student subclass, a Course class, and a MainApp execution class.

The project demonstrates fundamental OOP concepts including encapsulation , inheritance , polymorphism and abstraction. The system successfully processes multiple students, computes grades dynamically, and displays complete student records in a structured format, meeting all functional and design requirements of the project.

# System Design Overview

The system consists of the following classes:

1. **Person (Abstract Class)**
2. **Student (Subclass of Person)**
3. **Course**
4. **MainApp (Application Class)**


# Class Design Explanation

## 1️⃣ Person (Abstract Class)
The Person class acts as a general template for all individuals in the system. It stores basic information such as the name and sets a rule that any type of person must be able to show their details. This ensures a consistent structure and allows other classes, like Student, to build on this template.

## 2️⃣ Student (Inheritance & Polymorphism)
The Student class extends the Person class(subclass of Person class), adding specific attributes such as student ID, marks, and course enrollment. It also includes a method to calculate grades based on marks. By overriding the display method from Person, the system can show student-specific details while following the same overall structure, demonstrating flexibility in design.

## 3️⃣ Course Class (Encapsulation)
The Course class stores information about courses, including course name and code. These details are kept private and accessed through controlled methods, ensuring that each student is correctly linked to a course. This part keeps course data organized and secure while supporting the functionality of the Student class.

## 4️⃣ MainApp Class
The MainApp class is the central part of the system that runs the program. It creates Course and Student objects, calculates grades, and displays all student details. This class coordinates the different parts of the system and ensures that the program works correctly from start to finish.

## Functional Requirements 

The system successfully:

* Captures Student ID
* Captures Student Name
* Captures Course details
* Captures Student Marks
* Calculates Grade based on marks
* Displays full student details

# OOP Concepts Demonstrated

## 1. Encapsulation

* All class attributes are declared private and accessed only through public getter and setter methods. This ensures that the internal state of objects is protected and can only be modified in a controlled way.

* Example from Student class:

private int studentId;
private int marks;
private Course course;

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

## 2. Inheritance

* The Student class inherits common attributes and behavior from the abstract Person class, demonstrating inheritance. This allows reusability and avoids code duplication.

* Example:

public class Student extends Person {
    // Student inherits 'name' from Person
    private int studentId;
    private int marks;
    private Course course;

    public Student(int studentId, String name, int marks, Course course) {
        super(name); // calling Person constructor
        this.studentId = studentId;
        this.marks = marks;
        this.course = course;
    }
}

## 3. Polymorphism

* The Student class overrides the abstract method displayDetails() from Person, demonstrating runtime polymorphism. This allows different objects to have customized behavior for the same method.

Example:

@Override
public void displayDetails() {
    System.out.println("Student ID: " + studentId);
    System.out.println("Student Name: " + name);
    course.displayCourse();
    System.out.println("Marks: " + marks);
    System.out.println("Grade: " + calculateGrade());
    System.out.println("----------------------------");
}
## 4. Abstraction

* The Person class is declared abstract, providing a general blueprint for all person-like objects. It contains the abstract method displayDetails() which must be implemented by all subclasses, ensuring a standard interface while allowing flexibility.

Example:

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void displayDetails(); // must be implemented by subclasses
}

# 🧮 Grade Calculation Logic

| Marks    | Grade |
| -------- | ----- |
| 70 – 100 | A     |
| 60 – 69  | B     |
| 50 – 59  | C     |
| Below 50 | Fail  |

# ▶️ How to Run the Program

### Step 1: Compile
Open your terminal, navigate to the cloned project folder, and run:

javac *.java

This compiles all .java files into .class files.
### Step 2: Run
After successful compilation, execute the program using:

java MainApp

The program will create student and course objects, calculate grades, and display student details in the terminal.

# 🖥 Sample Output
Student ID: 1
Student Name: Kelvin Kariuki
Course Name: Object Oriented Software Design Methods
Course Code: OOSDM101
Marks: 95
Grade: A
----------------------------

Student ID: 2
Student Name: Grace Wanjiku
Course Name: Data Structures and Algorithms
Course Code: DSA102
Marks: 90
Grade: A
----------------------------

Student ID: 3
Student Name: Jane wambua
Course Name: Object Oriented Software Design Methods
Course Code: OOSDM101
Marks: 85
Grade: A
----------------------------

Student ID: 4
Student Name: Mutisya Simiyu
Course Name: Data Structures and Algorithms
Course Code: DSA102
Marks: 80
Grade: A
----------------------------

# 📌 Conclusion

The Student Management System successfully demonstrates fundamental Object-Oriented Software Design principles. The use of abstraction, encapsulation, inheritance, and polymorphism ensures modular, maintainable, and reusable code.

The project meets all functional and structural requirements specified in the assessment instructions.
