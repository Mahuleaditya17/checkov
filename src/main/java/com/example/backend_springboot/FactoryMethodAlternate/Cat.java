package com.example.backend_springboot.FactoryMethodAlternate;

public class Cat implements Pet{
    @Override
    public String speak(){
        return "Meow";
    }
}
