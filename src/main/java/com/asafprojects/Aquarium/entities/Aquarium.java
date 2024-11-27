package com.asafprojects.Aquarium.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Aquarium {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "aquarium", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Fish> fishes = new ArrayList<>();

    public Aquarium(String name, List<Fish> fishes) {
        this.name = name;
        this.fishes = fishes;
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

    public List<Fish> getFishes() {
        return fishes;
    }

    public void setFishes(List<Fish> fishes) {
        this.fishes = fishes;
    }
}