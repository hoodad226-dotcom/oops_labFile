
class Product {
    String productName;
    double price;
    int quantity;

    Product() {
        productName = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    Product(String name) {
        productName = name;
        price = 0.0;
        quantity = 0;
    }

    Product(String name, double p) {
        productName = name;
        price = p;
        quantity = 1;
    }

    Product(String name, double p, int q) {
        productName = name;
        price = p;
        quantity = q;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println();
    }

    public static void main(String[] args) {

        Product p1 = new Product();

        Product p2 = new Product("Laptop");

        Product p3 = new Product("Mouse", 500.0);

        Product p4 = new Product("Keyboard", 1000.0, 2);

        System.out.println("Default Constructor:");
        p1.display();

        System.out.println("Constructor with Name:");
        p2.display();

        System.out.println("Constructor with Name and Price:");
        p3.display();

        System.out.println("Constructor with All Parameters:");
        p4.display();
    }
}
