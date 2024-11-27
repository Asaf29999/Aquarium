package com.asafprojects.Aquarium.repositories;

import com.asafprojects.Aquarium.entities.Aquarium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AquariumRepository extends JpaRepository<Aquarium, Long> {
}