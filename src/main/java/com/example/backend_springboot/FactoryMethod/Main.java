package com.example.backend_springboot.FactoryMethod;

// Usage example
public class Main {
    public static void main(String[] args) {
        PetClinic petClinic = new PetClinic();

        // Creating a Dog using DogFactory
        PetFactory dogFactory = new DogFactory();
        petClinic.setPetFactory(dogFactory);
        petClinic.playWithPet(); // Output: Woof!

        // Creating a Cat using CatFactory
        PetFactory catFactory = new CatFactory();
        petClinic.setPetFactory(catFactory);
        petClinic.playWithPet(); // Output: Meow!
    }
}
