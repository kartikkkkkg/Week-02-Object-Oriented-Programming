import java.util.Scanner;

class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String name = sc.nextLine();
        System.out.print("Enter patient age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter patient ailment: ");
        String ailment = sc.nextLine();
        System.out.print("Enter patient ID: ");
        int patientID = sc.nextInt();
        Patient patient1 = new Patient(name, age, ailment, patientID);
        patient1.displayPatientDetails();
        Patient.getTotalPatients();
        sc.close();
    }
}