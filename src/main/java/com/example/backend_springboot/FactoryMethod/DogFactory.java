package com.example.backend_springboot.FactoryMethod;

// Concrete Creators
public class DogFactory implements PetFactory {
    @Override
    public Pet createPet() {
        return new Dog();
    }
}

