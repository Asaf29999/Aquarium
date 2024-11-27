package com.asafprojects.Aquarium.repositories;

import com.asafprojects.Aquarium.entities.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FishRepository extends JpaRepository<Fish, Long> {
    List<Fish> findBySpecies(String species);
}
