import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract String makeSound();

    public void displaySound() {
        System.out.println(name + " makes sound: " + makeSound());
    }
}

class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    String makeSound() {
        return "Bark";
    }
}

class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    String makeSound() {
        return "Meow";
    }
}

class Cow extends Animal {
    public Cow() {
        super("Cow");
    }

    @Override
    String makeSound() {
        return "Moo";
    }
}

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (Animal animal : animals) {
            animal.displaySound();
        }
    }
}