package com.asafprojects.Aquarium.entities;

import jakarta.persistence.Entity;

@Entity
public class Clownfish extends Fish {

    private final String species = "Clownfish"; // Fixed attribute

    public Clownfish() {
        super();
    }

    @Override
    public String getSpecies() {
        return species;
    }
}
