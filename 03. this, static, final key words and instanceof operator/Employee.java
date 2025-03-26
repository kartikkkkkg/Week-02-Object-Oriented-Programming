import java.util.Scanner;

class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;

    public Employee(String name, String designation, int id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Employee ID: " + id);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee designation: ");
        String designation = sc.nextLine();
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        Employee employee1 = new Employee(name, designation, id);
        employee1.displayEmployeeDetails();
        Employee.displayTotalEmployees();
        sc.close();
    }
}