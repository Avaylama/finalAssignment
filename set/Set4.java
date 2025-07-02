/** A
 
1. - extends

2. - 21

3. - An instance of a class

4. - ==

5. - Exits the loop entirely

6. - void method(int x)


7. - 3


8. - interface InterfaceName {}


9. - Heap memory


10. - Inheritance


11. - Exits the method and optionally returns a value


12. - Java105


 Section B

1.  Encapsulation in Java is the concept of wrapping data and the methods that operate on the data
    within one unit, i.e., a class. It helps protect the internal state of an object from unintended or
    harmful changes. It is implemented using private variables and public getter and setter methods.

Example:

class Person {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}



2.  Constructor chaining refers to the process of calling one constructor from another constructor
    within the same class using this().

Example:

class Student {

    Student() {
        this(10);
        System.out.println("Default Constructor");
    }
    Student(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }
    public static void main(String[] args) {
        new Student();
    }
}

Section C

a) Object class in Java:

The Object class is the root class of all Java classes. It provides methods like toString(), equals(),
hashCode(), and getClass().

b) Keywords break vs continue:

break exits the loop completely, while continue skips the current iteration and continues with the
next.

c) Role of access modifiers:
They control the visibility of class members. public, private, protected, and default determine where
the member can be accessed.

d) Use of instanceof operator:
It checks if an object is an instance of a specific class or subclass. Example: obj instanceof String.

e) Difference between class and interface:
A class can have method implementations, while an interface can only have abstract methods (until
Java 8+ which allows default methods).


Section D

1. Java program demonstrating multi-level inheritance:

class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
    }
    class Mammal extends Animal {
        void makeSound() {
        System.out.println("Mammal makes sound");
    }
    }
    class Dog extends Mammal {
        void makeSound() {
        System.out.println("Dog barks");
    }
    }
    public class TestInheritance {
        public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}


2. Java program for course registration system:

import java.util.*;
class Course {
    String courseId, courseName, instructor;
    Course(String courseId, String courseName, String instructor) {
    this.courseId = courseId;
    this.courseName = courseName;
    this.instructor = instructor;
    }
    public String toString() {
        return courseId + " - " + courseName + " by " + instructor;
    }
}
public class CourseRegistration {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ArrayList<Course> courses = new ArrayList<>();

    System.out.println("Enter number of courses:");

    int n = sc.nextInt();

    sc.nextLine();

    for (int i = 0; i < n; i++) {
        System.out.println("Enter courseId, courseName, instructor:");

        String id = sc.nextLine();

        String name = sc.nextLine();

        String instructor = sc.nextLine();

        courses.add(new Course(id, name, instructor));
    }

    System.out.println("Registered Courses:");

    for (Course c : courses) {
        System.out.println(c);
    }   
  }
}

**/