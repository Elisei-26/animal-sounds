package com.animalSounds.src;

public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public String makeSound() {
        return "Bark";
    }
}
