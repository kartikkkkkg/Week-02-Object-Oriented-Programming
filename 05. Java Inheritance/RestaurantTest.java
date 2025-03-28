class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving customers.");
    }
}

public class RestaurantTest {
    public static void main(String[] args) {
        Worker chef = new Chef("John", 101);
        Worker waiter = new Waiter("Mike", 102);
        chef.performDuties();
        waiter.performDuties();
    }
}