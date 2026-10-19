class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    String model = "Innova";

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Person {
    String name = "Rahul";

    void showName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId = 101;

    void showEmployeeId() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department = "IT";

    void showDepartment() {
        System.out.println("Department: " + department);
    }
}

class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius = 5.0;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.2f%n", area);
    }
}

class Rectangle extends Shape {
    double length = 4.0;
    double width = 3.0;

    void calculateArea() {
        double area = length * width;
        System.out.printf("Area of Rectangle: %.2f%n", area);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("SINGLE INHERITANCE");
        Car c = new Car();
        c.display();
        c.start();

        System.out.println("\nMULTILEVEL INHERITANCE");
        Manager m = new Manager();
        m.showName();
        m.showEmployeeId();
        m.showDepartment();

        System.out.println("\nHIERARCHICAL INHERITANCE");
        Circle cir = new Circle();
        cir.display();
        cir.calculateArea();

        Rectangle r = new Rectangle();
        r.display();
        r.calculateArea();
    }
}
