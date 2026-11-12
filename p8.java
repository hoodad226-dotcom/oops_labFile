
class Demo {

    Demo() {
        System.out.println("Object is constructed.");
    }

    void display() {
        System.out.println("Object is being used.");
    }

    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.display();

        obj = null;

        System.out.println("Object reference removed.");

        System.gc();

        System.out.println("Garbage collection requested.");
    }
}
