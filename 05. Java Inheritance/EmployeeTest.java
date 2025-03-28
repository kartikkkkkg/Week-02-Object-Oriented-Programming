import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int internshipDuration;

    public Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Manager's name: ");
        String managerName = sc.nextLine();
        System.out.print("Enter Manager's ID: ");
        int managerId = sc.nextInt();
        System.out.print("Enter Manager's salary: ");
        double managerSalary = sc.nextDouble();
        System.out.print("Enter Manager's team size: ");
        int managerTeamSize = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Developer's name: ");
        String devName = sc.nextLine();
        System.out.print("Enter Developer's ID: ");
        int devId = sc.nextInt();
        System.out.print("Enter Developer's salary: ");
        double devSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Developer's programming language: ");
        String devLang = sc.nextLine();
        System.out.print("Enter Intern's name: ");
        String internName = sc.nextLine();
        System.out.print("Enter Intern's ID: ");
        int internId = sc.nextInt();
        System.out.print("Enter Intern's salary: ");
        double internSalary = sc.nextDouble();
        System.out.print("Enter Internship duration: ");
        int internDuration = sc.nextInt();
        Employee manager = new Manager(managerName, managerId, managerSalary, managerTeamSize);
        Employee developer = new Developer(devName, devId, devSalary, devLang);
        Employee intern = new Intern(internName, internId, internSalary, internDuration);
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}