package com.example.backend_springboot.controller;

import java.util.LinkedList;
import java.util.Queue;

class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Veterinarian {
    private String name;
    private boolean available;

    public Veterinarian(String name) {
        this.name = name;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class PetTreatmentSystem {
    private Queue<Pet> petQueue;
    private Queue<Veterinarian> veterinarianQueue;

    public PetTreatmentSystem() {
        petQueue = new LinkedList<>();
        veterinarianQueue = new LinkedList<>();
    }

    public void addPetToQueue(Pet pet) {
        petQueue.add(pet);
    }

    public void addVeterinarianToQueue(Veterinarian veterinarian) {
        veterinarianQueue.add(veterinarian);
    }

    public void processPetTreatment() {
        if (!petQueue.isEmpty() && !veterinarianQueue.isEmpty()) {
            Pet pet = petQueue.poll();
            Veterinarian veterinarian = veterinarianQueue.poll();

            System.out.println("Pet: " + pet.getName() + " is being treated by Veterinarian: " + veterinarian.getName());

            veterinarian.setAvailable(false); // Set veterinarian as unavailable during treatment

            // Simulating pet treatment by delaying the process for a certain period
            try {
                Thread.sleep(2000); // Delay of 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Pet: " + pet.getName() + " treatment completed.");

            veterinarian.setAvailable(true); // Set veterinarian as available after treatment
        } else {
            System.out.println("No pets or veterinarians available at the moment.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PetTreatmentSystem system = new PetTreatmentSystem();

        Veterinarian vet1 = new Veterinarian("Dr. Smith");
        Veterinarian vet2 = new Veterinarian("Dr. Johnson");

        system.addVeterinarianToQueue(vet1);
        system.addVeterinarianToQueue(vet2);

        Pet pet1 = new Pet("Fluffy");
        Pet pet2 = new Pet("Buddy");
        Pet pet3 = new Pet("Max");

        system.addPetToQueue(pet1);
        system.addPetToQueue(pet2);
        system.addPetToQueue(pet3);

        system.processPetTreatment();
        system.processPetTreatment();
        system.processPetTreatment();
        system.processPetTreatment();
    }
}

