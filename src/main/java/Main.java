import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> toTestAnimals = new ArrayList<>();

        toTestAnimals.add("DOG Zh");
        toTestAnimals.add("CAT May");
        toTestAnimals.add("COW Myyy");
        toTestAnimals.add("HORSE Brrr");
        toTestAnimals.add("dOG Жулик");
        toTestAnimals.add("CAT Mur");
        toTestAnimals.add("OOO NOT_CORRECT_NAME");
        toTestAnimals.add("CAT");

        AnimalFarm animalFarm = new AnimalFarm(toTestAnimals);

        animalFarm.printFarmAnimals();
        System.out.println("_________");

        System.out.println(animalFarm.countedAnimals(toTestAnimals));
        System.out.println("_________");

        System.out.println(animalFarm.uniqueNames());
        System.out.println("_________");

        animalFarm.addNewAnimal(Animal.DOG, "Poll");
        animalFarm.addNewAnimal(Animal.CAT);
        animalFarm.addNewAnimal("NoName");

        animalFarm.printFarmAnimals();
        System.out.println("+++++++++++++++++++");

        System.out.println(animalFarm.toString());
    }
}
