import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();

    public void displaySound() {
        System.out.println(getName() + " makes sound: " + makeSound());
    }
}

class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public String makeSound() {
        return "Bark";
    }
}

class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}

class Cow extends Animal {
    public Cow() {
        super("Cow");
    }

    @Override
    public String makeSound() {
        return "Moo";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(); // Explicit generic type usage
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (Animal animal : animals) {
            animal.displaySound();
        }
    }
}
