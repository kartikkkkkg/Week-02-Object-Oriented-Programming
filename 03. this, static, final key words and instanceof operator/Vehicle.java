import java.util.Scanner;

class Vehicle {
    static double registrationFee = 200.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Vehicle Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle owner name: ");
        String ownerName = sc.nextLine();
        System.out.print("Enter vehicle type: ");
        String vehicleType = sc.nextLine();
        System.out.print("Enter vehicle registration number: ");
        String registrationNumber = sc.nextLine();
        Vehicle vehicle1 = new Vehicle(ownerName, vehicleType, registrationNumber);
        vehicle1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(250.0);
        vehicle1.displayVehicleDetails();
        sc.close();
    }
}