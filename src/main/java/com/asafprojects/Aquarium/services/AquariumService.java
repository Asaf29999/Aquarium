package com.asafprojects.Aquarium.services;

import com.asafprojects.Aquarium.entities.Aquarium;
import com.asafprojects.Aquarium.repositories.AquariumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AquariumService {
    private final AquariumRepository aquariumRepository;

    public AquariumService(AquariumRepository aquariumRepository) {
        this.aquariumRepository = aquariumRepository;
    }

    public Aquarium addAquarium(Aquarium aquarium) {
        return aquariumRepository.save(aquarium);
    }

    public List<Aquarium> getAllAquariums() {
        return aquariumRepository.findAll();
    }
}
