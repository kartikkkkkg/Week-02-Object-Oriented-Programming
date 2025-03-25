public class Product {
    private static int totalProducts = 0;
    private String productName;
    private double price;

    public Product() {
        this.productName = "Fruits";
        this.price = 99.0;
        totalProducts++;
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Smartphone", 30000.0);
        Product p3 = new Product();
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();
        Product.displayTotalProducts();
    }
}