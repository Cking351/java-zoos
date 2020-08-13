package com.lambda.javazoo.models;

public class ZooAnimals {

    private Zoo zoo;

    private Animal animal;

    private String incomingzoos;

    public ZooAnimals() {
    }

    public ZooAnimals(Zoo zoo, Animal animal, String incomingzoos) {
        this.zoo = zoo;
        this.animal = animal;
        this.incomingzoos = incomingzoos;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getIncomingzoos() {
        return incomingzoos;
    }

    public void setIncomingzoos(String incomingzoos) {
        this.incomingzoos = incomingzoos;
    }
}
