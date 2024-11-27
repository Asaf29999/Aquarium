package com.asafprojects.Aquarium;

import com.asafprojects.Aquarium.entities.Aquarium;
import com.asafprojects.Aquarium.entities.Fish;
import com.asafprojects.Aquarium.repositories.AquariumRepository;
import com.asafprojects.Aquarium.repositories.FishRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AquariumApplication {

	public static void main(String[] args) {
		SpringApplication.run(AquariumApplication.class, args);
	}

	@Bean
	CommandLineRunner run(FishRepository fishRepository, AquariumRepository aquariumRepository) {
		return args -> {
			// Create an aquarium
			Aquarium aquarium = new Aquarium();
			aquarium.setName("Tropical Paradise");

			// Create some fish
			Fish fish1 = new Fish();
			fish1.setName("Nemo");
			fish1.setSpecies("Clownfish");
			fish1.setAquarium(aquarium);

			Fish fish2 = new Fish();
			fish2.setName("Dory");
			fish2.setSpecies("Blue Tang");
			fish2.setAquarium(aquarium);

			Fish fish3 = new Fish();
			fish3.setName("Goldy");
			fish3.setSpecies("Goldfish");
			fish3.setAquarium(aquarium);

			// Add fish to the aquarium's fish list
			aquarium.getFishes().add(fish1);
			aquarium.getFishes().add(fish2);
			aquarium.getFishes().add(fish3);

			// Save the aquarium (cascades save of fish due to @OneToMany cascade configuration)
			aquariumRepository.save(aquarium);

			System.out.println("Saved Aquarium: " + aquarium.getName());
		};
	}
}
