public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Meri Kaksha";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 15000.0);
        Course c2 = new Course("Python", 4, 12000.0);
        System.out.println("Before Updating Institute Name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("New Academy");
        System.out.println("After Updating Institute Name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}