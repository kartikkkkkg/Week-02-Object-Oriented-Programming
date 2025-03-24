import java.util.Scanner;

public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.printf("Price: $%.2f\n", price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item code: ");
        int itemCode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        Item item = new Item(itemCode, itemName, price);
        item.displayDetails();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.printf("Total Cost: $%.2f\n", item.calculateTotalCost(quantity));
        scanner.close();
    }
}