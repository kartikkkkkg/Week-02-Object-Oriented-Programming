import java.util.Scanner;

class Product {
    static double discount = 10.0;
    final int productID;
    String productName;
    double price;
    int quantity;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Product ID: " + productID);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String productName = sc.nextLine();
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        System.out.print("Enter product quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter product ID: ");
        int productID = sc.nextInt();
        Product product1 = new Product(productName, price, quantity, productID);
        product1.displayProductDetails();
        Product.updateDiscount(15.0);
        product1.displayProductDetails();
        sc.close();
    }
}