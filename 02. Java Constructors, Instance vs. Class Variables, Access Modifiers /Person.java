public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person original = new Person("Kartik", 22);
        Person clone = new Person(original);
        System.out.println("Original Person:");
        original.displayInfo();
        System.out.println("Cloned Person:");
        clone.displayInfo();
    }
}