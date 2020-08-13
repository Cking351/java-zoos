package com.lambda.javazoo.models;

public class Animal {

    private long animalid;

    private String animaltype;

    public Animal() {
    }

    public Animal(long animalid, String animaltype) {
        this.animalid = animalid;
        this.animaltype = animaltype;
    }

    public long getAnimalid() {
        return animalid;
    }

    public void setAnimalid(long animalid) {
        this.animalid = animalid;
    }

    public String getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }
}
