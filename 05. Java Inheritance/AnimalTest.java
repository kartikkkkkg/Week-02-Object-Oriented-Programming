import java.util.Scanner;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dog's name: ");
        String dogName = sc.nextLine();
        System.out.print("Enter Dog's age: ");
        int dogAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Cat's name: ");
        String catName = sc.nextLine();
        System.out.print("Enter Cat's age: ");
        int catAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Bird's name: ");
        String birdName = sc.nextLine();
        System.out.print("Enter Bird's age: ");
        int birdAge = sc.nextInt();
        Animal dog = new Dog(dogName, dogAge);
        Animal cat = new Cat(catName, catAge);
        Animal bird = new Bird(birdName, birdAge);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}