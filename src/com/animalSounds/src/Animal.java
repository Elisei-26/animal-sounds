package com.animalSounds.src;

public abstract class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public abstract String makeSound();

    public void displaySound() {
        System.out.println(getSpecies() + " makes sound: " + makeSound());
    }
}