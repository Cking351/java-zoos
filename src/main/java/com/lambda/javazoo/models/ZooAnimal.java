package com.lambda.javazoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "zooanimals")
public class ZooAnimal extends Auditable implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "zooanimals", allowSetters = true)
    private Zoo zoo;

    @Id
    @ManyToOne
    @JoinColumn(name = "animalid")
    @JsonIgnoreProperties(value = "zooanimals", allowSetters = true)
    private Animal animal;

    public ZooAnimal() {
    }

    public ZooAnimal(Zoo zoo, Animal animal) {
        this.zoo = zoo;
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooAnimal that = (ZooAnimal) o;
        return zoo.equals(that.zoo) &&
                animal.equals(that.animal);
    }


    @Override
    public int hashCode() {
        return 37;
    }
}
