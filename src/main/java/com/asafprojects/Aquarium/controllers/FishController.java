package com.asafprojects.Aquarium.controllers;

import com.asafprojects.Aquarium.entities.Fish;
import com.asafprojects.Aquarium.services.FishService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fish")
public class FishController {
    private final FishService fishService;

    public FishController(FishService fishService) {
        this.fishService = fishService;
    }

    @PostMapping
    public ResponseEntity<Fish> addFish(@RequestBody Fish fish) {
        return ResponseEntity.ok(fishService.addFish(fish));
    }

    @GetMapping
    public ResponseEntity<List<Fish>> getAllFish() {
        return ResponseEntity.ok(fishService.getAllFish());
    }

    @GetMapping("/{species}")
    public ResponseEntity<List<Fish>> getFishBySpecies(@PathVariable String species) {
        return ResponseEntity.ok(fishService.getFishBySpecies(species));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFish(@PathVariable Long id) {
        fishService.deleteFish(id);
        return ResponseEntity.noContent().build();
    }
}
