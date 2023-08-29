package com.example.backend_springboot.FactoryMethodAlternate;

public class Dog implements Pet{
    @Override
    public String speak(){
        return "Woof";
    }
}
