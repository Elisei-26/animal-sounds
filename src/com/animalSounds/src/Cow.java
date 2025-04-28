package com.animalSounds.src;

public class Cow extends Animal {
    public Cow() {
        super("Cow");
    }

    @Override
    public String makeSound() {
        return "Moo";
    }
}
