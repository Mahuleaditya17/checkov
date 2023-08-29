package com.example.backend_springboot.FactoryMethodAlternate;

public class PetFactory {
    public Pet getPet(String type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case "Woof":
                return new Dog();
            case "Meow":
                return new Cat();
            default: throw new IllegalArgumentException("Unknown type");
        }
    }
}
