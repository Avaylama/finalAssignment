// section 'A'
// 1. int arr[] = {1, 2, 3};
// 2. 2
// 3. extends
// 4. public
// 5. Compilation
// 6. Defining a method in a subclass that already exists in the parent class
// 7. 8
// 8. char
// 9. 4
// 10. Hiding implementation details and exposing only necessary parts
// 11. implements
// 12. do-while


// Section 'B'

/** 1. ---->  Method overloading means defining multiple methods with the same name in the same class, but with different parameters (number, type, or order). 
     public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public double add(double a, double b) {
        return a + b;
    }
}
 
Method overriding means redefining a method in a subclass that already exists in its superclass, using the same name and parameters.

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

2.--->   super is used to refer to the parent class. It helps to:

Call the parent class method.

Access parent class variables.

Call the parent class constructor.

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // calls Animal constructor
    }

    void sound() {
        super.sound(); // calls Animal sound()
        System.out.println("Dog barks");
    }
}

**/


/** 
a)--->  Java Class and Object
A class is a blueprint for creating objects; it defines properties (fields) and behaviors (methods).

An object is an instance of a class created using the new keyword.
Example:

class Car {
    String color;
    void drive() {
        System.out.println("Driving...");
    }
}
Car myCar = new Car();



b) Constructor Overloading
Constructor overloading means having multiple constructors in a class with different parameter lists.

It allows object creation in different ways.
Example:

class Person {
    Person() {}
    Person(String name) {}
}

e) Logical Operators in Java
Logical operators are used to combine multiple conditions.

Common operators:

&& (AND)

|| (OR)

! (NOT)
Example:

if (a > 0 && b > 0) {
    System.out.println("Both positive");
}

d) Importance of the main Method
main() is the entry point of any Java program.

It must be written as:

public static void main(String[] args)





**/



// Section D

/** 
a. --->
class Product {
    int id;
    String name;
    double price;

    Product() {
        id = 0;
        name = "Unknown";
        price = 0.0;
    }

    Product(int id, String name) {
        this.id = id;
        this.name = name;
        price = 0.0;
    }

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop");
        Product p3 = new Product(102, "Smartphone", 799.99);

        p1.display();
        System.out.println();
        p2.display();
        System.out.println();
        p3.display();
    }
}


b. ---->

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    double calculateSalary() {
        return 0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }

    void display() {
        super.display();
        System.out.println("Full-time Salary: " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    void display() {
        super.display();
        System.out.println("Part-time Salary: " + calculateSalary());
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee("Alice", 101, 5000);
        PartTimeEmployee pt = new PartTimeEmployee("Bob", 102, 20, 80);

        ft.display();
        System.out.println();
        pt.display();
    }
}


*/