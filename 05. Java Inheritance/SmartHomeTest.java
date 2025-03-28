import java.util.Scanner;

class Device {
    int deviceId;
    String status;

    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    public Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Device ID: ");
        int deviceId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Device Status: ");
        String status = sc.nextLine();
        System.out.print("Enter Thermostat Temperature Setting: ");
        int temperatureSetting = sc.nextInt();
        Device device = new Thermostat(deviceId, status, temperatureSetting);
        device.displayStatus();
    }
}