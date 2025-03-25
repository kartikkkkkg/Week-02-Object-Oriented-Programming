public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double COST_PER_DAY = 500.00;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateCost() {
        return rentalDays * COST_PER_DAY;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        rental1.displayRentalDetails();
        CarRental rental2 = new CarRental("Kartik", "Camry", 10);
        rental2.displayRentalDetails();
    }
}