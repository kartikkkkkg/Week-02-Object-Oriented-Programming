import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private List<String> records;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.records = new ArrayList<>();
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();

    protected List<String> getRecords() {
        return records;
    }
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    public void addRecord(String record) {
        getRecords().add(record);
    }

    public List<String> viewRecords() {
        return getRecords();
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        getRecords().add(record);
    }

    public List<String> viewRecords() {
        return getRecords();
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient("P101", "Alice", 45, 5, 1000);
        inPatient.addRecord("Appendicitis surgery");
        inPatient.addRecord("Antibiotic course");
        OutPatient outPatient = new OutPatient("P202", "Bob", 30, 500);
        outPatient.addRecord("General checkup");
        List<Patient> patients = Arrays.asList(inPatient, outPatient);
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                System.out.println("Records: " + ((MedicalRecord) p).viewRecords());
            }
            System.out.println();
        }
    }
}