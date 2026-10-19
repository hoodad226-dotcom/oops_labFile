
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    double calculatePay() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    @Override
    double calculatePay() {
        return 30000 + 5000;
    }
}

class PartTimeEmployee extends Employee {
    @Override
    double calculatePay() {
        return 500 * 40;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Sum of two integers: " + c.add(10, 20));
        System.out.println("Sum of three integers: " + c.add(10, 20, 30));
        System.out.println("Sum of two doubles: " + c.add(5.5, 4.5));

        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full-time employee pay: " + e.calculatePay());

        e = new PartTimeEmployee();
        System.out.println("Part-time employee pay: " + e.calculatePay());
    }
}
