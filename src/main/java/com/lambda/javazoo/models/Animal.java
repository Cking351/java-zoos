package com.lambda.javazoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "animal")
public class Animal extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;

    @Column(nullable = false)
    private String animaltype;

    private String incomingzoo;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "animal", allowSetters = true)
    private Set<ZooAnimal> zoos = new HashSet<>();

    public Animal() {
    }

    public Animal(long animalid, String animaltype, String incomingzoo, Set<ZooAnimal> zoos) {
        this.animalid = animalid;
        this.animaltype = animaltype;
        this.incomingzoo = incomingzoo;
        this.zoos = zoos;
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

    public String getIncomingzoo() {
        return incomingzoo;
    }

    public void setIncomingzoo(String incomingzoo) {
        this.incomingzoo = incomingzoo;
    }

    public Set<ZooAnimal> getZoos() {
        return zoos;
    }

    public void setZoos(Set<ZooAnimal> zoos) {
        this.zoos = zoos;
    }
}
