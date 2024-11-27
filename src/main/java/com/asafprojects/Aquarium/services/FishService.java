package com.asafprojects.Aquarium.services;

import com.asafprojects.Aquarium.entities.Fish;
import com.asafprojects.Aquarium.repositories.FishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FishService {
    private final FishRepository fishRepository;

    public FishService(FishRepository fishRepository) {
        this.fishRepository = fishRepository;
    }

    public Fish addFish(Fish fish) {
        return fishRepository.save(fish);
    }

    public List<Fish> getAllFish() {
        return fishRepository.findAll();
    }

    public List<Fish> getFishBySpecies(String species) {
        return fishRepository.findBySpecies(species);
    }

    public void deleteFish(Long id) {
        fishRepository.deleteById(id);
    }
}
