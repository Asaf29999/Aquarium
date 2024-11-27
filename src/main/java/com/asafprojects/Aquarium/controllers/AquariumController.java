package com.asafprojects.Aquarium.controllers;

import com.asafprojects.Aquarium.entities.Aquarium;
import com.asafprojects.Aquarium.services.AquariumService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aquariums")
public class AquariumController {
    private final AquariumService aquariumService;

    public AquariumController(AquariumService aquariumService) {
        this.aquariumService = aquariumService;
    }

    @PostMapping
    public ResponseEntity<Aquarium> addAquarium(@RequestBody Aquarium aquarium) {
        return ResponseEntity.ok(aquariumService.addAquarium(aquarium));
    }

    @GetMapping
    public ResponseEntity<List<Aquarium>> getAllAquariums() {
        return ResponseEntity.ok(aquariumService.getAllAquariums());
    }
}