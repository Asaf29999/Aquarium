//package com.asafprojects.Aquarium;
//
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//@Testcontainers
//public class FishRepositoryTest {
//    @Container
//    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:latest")
//            .withDatabaseName("testdb")
//            .withUsername("test")
//            .withPassword("test");
//
//    @Autowired
//    private FishRepository fishRepository;
//
//    @Test
//    public void testAddFish() {
//        Fish fish = new Fish();
//        fish.setName("Nemo");
//        fish.setSpecies("Clownfish");
//
//        Fish savedFish = fishRepository.save(fish);
//        assertNotNull(savedFish.getId());
//    }
//}
//
