//package com.example.backend_springboot.controller;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Pet {
//    private String name;
//    private boolean isCritical;
//
//    public Pet(String name, boolean isCritical) {
//        this.name = name;
//        this.isCritical = isCritical;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean isCritical() {
//        return isCritical;
//    }
//}
//
//class Veterinarian {
//    private String name;
//
//    public Veterinarian(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void treatPet(Pet pet) {
//        System.out.println("Veterinarian " + name + " is treating pet " + pet.getName());
//    }
//}
//
//class PetClinic {
//    private Queue<Pet> petQueue;
//    private Queue<Veterinarian> veterinarianQueue;
//
//    public PetClinic() {
//        petQueue = new LinkedList<>();
//        veterinarianQueue = new LinkedList<>();
//    }
//
//    public void addPetToQueue(Pet pet) {
//        petQueue.add(pet);
//    }
//
//    public void addVeterinarianToQueue(Veterinarian veterinarian) {
//        veterinarianQueue.add(veterinarian);
//    }
//
//    public void processPetTreatment() {
//        while (!petQueue.isEmpty() && !veterinarianQueue.isEmpty()) {
//            Pet pet = petQueue.poll();
//            Veterinarian veterinarian = veterinarianQueue.poll();
//
//            veterinarian.treatPet(pet);
//
//            if (pet.isCritical()) {
//                // Move the veterinarian to the end of the queue for critical cases
//                veterinarianQueue.add(veterinarian);
//            }
//        }
//    }
//}
//
//public class FCFSAlgorithmExample {
//    public static void main(String[] args) {
//        PetClinic petClinic = new PetClinic();
//
//        // Create pets
//        Pet pet1 = new Pet("Max", false);
//        Pet pet2 = new Pet("Bella", false);
//        Pet pet3 = new Pet("Charlie", true);
//        Pet pet4 = new Pet("Lucy", false);
//        Pet pet5 = new Pet("Bruno", true);
//        Pet pet6 = new Pet("Maggie", false);
//        Pet pet7 = new Pet("Letty", false);
//        Pet pet8 = new Pet("Catty",false);
//
//        // Add pets to the pet clinic queue
//        petClinic.addPetToQueue(pet1);
//        petClinic.addPetToQueue(pet2);
//        petClinic.addPetToQueue(pet3);
//        petClinic.addPetToQueue(pet4);
//        petClinic.addPetToQueue(pet5);
//        petClinic.addPetToQueue(pet6);
//        petClinic.addPetToQueue(pet7);
//        petClinic.addPetToQueue(pet8);
//
//        // Create veterinarians
//        Veterinarian vet1 = new Veterinarian("Dr. Smith");
//        Veterinarian vet2 = new Veterinarian("Dr. Johnson");
//        Veterinarian vet3 = new Veterinarian("Dr. Davis");
//
//        // Add veterinarians to the pet clinic queue
//        petClinic.addVeterinarianToQueue(vet1);
//        petClinic.addVeterinarianToQueue(vet2);
//        petClinic.addVeterinarianToQueue(vet3);
//
//        // Process pet treatment
//        petClinic.processPetTreatment();
//    }
//}
