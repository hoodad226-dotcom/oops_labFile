interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

class Machine {
    void start() {
        System.out.println("Machine is starting...");
    }
}

class SmartPrinter extends Machine implements Printable, Scannable {

    public void print() {
        System.out.println("Smart printer is printing...");
    }

    public void scan() {
        System.out.println("Smart printer is scanning...");
    }
}

public class Main {
    public static void main(String[] args) {

        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        System.out.println();

        SmartPrinter smartPrinter = new SmartPrinter();
        smartPrinter.start();
        smartPrinter.print();
        smartPrinter.scan();
    }
}
