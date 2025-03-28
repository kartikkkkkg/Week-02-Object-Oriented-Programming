import java.util.Scanner;

class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
    }
}

public class CourseTest {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Programming", 8, "Udemy", true, 200, 15);
        poc.displayInfo();
    }
}