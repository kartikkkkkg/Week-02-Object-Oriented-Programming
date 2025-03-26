import java.util.Scanner;

class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    public Student(String name, String grade, int rollNumber) {
        this.name = name;
        this.grade = grade;
        this.rollNumber = rollNumber;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("Roll Number: " + rollNumber);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student grade: ");
        String grade = sc.nextLine();
        System.out.print("Enter student roll number: ");
        int rollNumber = sc.nextInt();
        Student student1 = new Student(name, grade, rollNumber);
        student1.displayStudentDetails();
        Student.displayTotalStudents();
        sc.close();
    }
}