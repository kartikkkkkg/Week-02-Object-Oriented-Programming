class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("General Person");
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Teacher - Subject: " + subject);
    }
}

class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Student - Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Staff - Department: " + department);
    }
}

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, 10);
        Staff staff = new Staff("Charlie", 40, "Administration");
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}