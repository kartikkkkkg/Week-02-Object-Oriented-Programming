import java.util.Scanner;

public class MobilePhone {
    private String brand;
    private String model;
    private int price;

    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter price: ");
        int price = scanner.nextInt();
        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.displayDetails();
        scanner.close();
    }
}