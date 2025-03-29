import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String location) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = location;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8;
    }
}

class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9;
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car("C001", "Alex", 15.0, "Downtown");
        Bike bike = new Bike("B001", "John", 10.0, "City Center");
        Auto auto = new Auto("A001", "Mike", 12.0, "Station");
        List<Vehicle> rides = Arrays.asList(car, bike, auto);
        System.out.print("Enter distance for each ride: ");
        double distance = sc.nextDouble();
        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Current Location: " + v.getCurrentLocation());
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            System.out.println();
        }
    }
}