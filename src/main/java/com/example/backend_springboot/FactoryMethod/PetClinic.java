package com.example.backend_springboot.FactoryMethod;

// Client code
public class PetClinic {
    private PetFactory petFactory;

    public void setPetFactory(PetFactory petFactory) {
        this.petFactory = petFactory;
    }

    public void playWithPet() {
        Pet pet = petFactory.createPet();
        pet.speak();
    }
}

