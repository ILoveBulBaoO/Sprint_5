import java.util.*;

public class AnimalFarm {
    ArrayList<String> farmAnimals;
    public AnimalFarm(ArrayList<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public void countedAnimals(ArrayList<String> farmAnimals) {
        //HashMap<String, Integer> animalsAndCount = new HashMap<>();
         ArrayList<String> animalsTypeList = new ArrayList<>();

        // сформировать список животных из вида, который есть в ENUM
        for (String animal : farmAnimals) {
            String[] animalTypeAndNameArray = animal.split(" ");
            animalsTypeList.add(animalTypeAndNameArray[0]);
        }
        // [DOG, CAT, COW, HORSE]
        System.out.println(animalsTypeList);

        // посчитать количество животных этого вида на ферме:
        // [DOG, CAT, COW, HORSE, DOG]
        int countDog = Collections.frequency(animalsTypeList, Animal.DOG.name());
        int countCat = Collections.frequency(animalsTypeList, Animal.CAT.name());
        int countCow = Collections.frequency(animalsTypeList, Animal.COW.name());
        int countHorse = Collections.frequency(animalsTypeList, Animal.HORSE.name());
        // 2 1 1 1
        System.out.println(countDog);
        System.out.println(countCat);
        System.out.println(countCow);
        System.out.println(countHorse);

        // заполнить хеш-таблицу



        // return animalsAndCount;
    }
}
