import java.util.ArrayList;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotalPrice());
    }
}

class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(String itemName, double price, int quantity) {
        items.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added.");
    }

    public void removeItem(String itemName) {
        items.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed.");
    }

    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            item.displayItem();
            total += item.getTotalPrice();
        }
        System.out.println("Total: ₹" + total);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 50, 2);
        cart.addItem("Banana", 20, 3);
        cart.displayTotalCost();
        cart.removeItem("Apple");
        cart.displayTotalCost();
    }
}