import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> testAnimals = new ArrayList<>();
        String animalDog = Animal.DOG.name();
        String animalCat = Animal.CAT.name();
        String animalCow = Animal.COW.name();
        String animalHorse = Animal.HORSE.name();
        testAnimals.add(animalDog + " Zh");
        testAnimals.add(animalCat + " May");
        testAnimals.add(animalCow + " Myyy");
        testAnimals.add(animalHorse + " Brrr");
        testAnimals.add(animalDog + " Жулик");
        AnimalFarm animalFarm = new AnimalFarm(testAnimals);
        animalFarm.countedAnimals(testAnimals);
    }
}
