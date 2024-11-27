package com.asafprojects.Aquarium.entities;

import jakarta.persistence.*;

@Entity
public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String species;

    @ManyToOne
    @JoinColumn(name = "aquarium_id")
    private Aquarium aquarium;

    public Fish(String name, String species, Aquarium aquarium) {
        this.name = name;
        this.species = species;
        this.aquarium = aquarium;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Aquarium getAquarium() {
        return aquarium;
    }

    public void setAquarium(Aquarium aquarium) {
        this.aquarium = aquarium;
    }
}
