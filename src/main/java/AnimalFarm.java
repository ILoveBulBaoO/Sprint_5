import java.util.*;

public class AnimalFarm {
    private ArrayList<String> farmAnimals;
    public AnimalFarm(ArrayList<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    // В классе AnimalFarm реализуй метод countedAnimals.
    // Он должен по полю farmAnimals формировать хеш-таблицу, в которой ключ — это вид животного (Animal), а значение — количество животных этого вида на ферме.
    // Если какая-то строка в списке не содержит первым словом валидный вид животного, метод должен вывести в консоль фразу: Please correct string [Здесь вывести полностью ошибочную строку]. Incorrect input data.
    // Метод возвращает сформированную хеш-таблицу.
    public HashMap<Animal, Integer> countedAnimals(ArrayList<String> farmAnimals) {
        HashMap<Animal, Integer> animalCountMap = new HashMap<>();

        for (String farmAnimal : farmAnimals) {

            try {
                String[] getAnimalFromStr = farmAnimal.split(" ");
                Animal animal = Animal.valueOf(getAnimalFromStr[0].toUpperCase());
                Integer countOfAnimals = animalCountMap.get(animal);

                if (countOfAnimals == null) {
                    countOfAnimals = 1;
                } else {
                    countOfAnimals += 1;
                }

                animalCountMap.put(animal, countOfAnimals);

            } catch (Exception exception) {
                System.out.println("Please correct string: " + farmAnimal + ". " + "Incorrect input data." );
            }
        }
        return animalCountMap;
    }

    // В классе AnimalFarm реализуй метод uniqueNames.
    // Он должен возвращать коллекцию всех уникальных имён животных на ферме.
    // Подходящий тип коллекции подбери самостоятельно.
    // Если в какой-то строке списка нет второго слова, метод должен вывести в консоль фразу: Please correct string [Здесь вывести полностью ошибочную строку]. Incorrect input data.
    public HashSet<String> uniqueNames () {
        ArrayList<String> listOfAnimals = new ArrayList<>();

        for (String farmAnimal : farmAnimals) {
            try {
                String[] getAnimalFromStr = farmAnimal.split(" ");
                listOfAnimals.add(getAnimalFromStr[1].toUpperCase());
            } catch (Exception e) {
                System.out.println("Please correct string: " + farmAnimal + ". " + "Incorrect input data.");
            }
        }

        HashSet<String> setUniqueNames = new HashSet<>(listOfAnimals);
        return setUniqueNames;
    }

    // В классе AnimalFarm реализуй три метода для разных вариантов добавления нового животного на ферму:
    // по переданному виду животного и имени;
    // по переданному виду животного. В этом случае имя животного равно N;
    // по переданному имени животного. В этом случае вид животного равен NOT_DEFINED
    public void addNewAnimal(Animal animal, String name) {
        farmAnimals.add(animal.name() + " " + name);
    }

    public void addNewAnimal(Animal animal) {
        String name = "N";
        farmAnimals.add(animal.name() + " " + name);
    }

    public void addNewAnimal(String name) {
        Animal animal = Animal.NOT_DEFINED;
        farmAnimals.add(animal + " " + name);
    }

    public void printFarmAnimals () {
        for (String farmAnimal : farmAnimals) {
            System.out.println(farmAnimal);
        }
    }

    // В классе AnimalFarm переопредели метод toString так, чтобы он выводил информацию по животным на ферме в виде:
    // Вид_животного: Имя_животного
    // Вид_животного: Имя_животного
    // Вид_животного: Имя_животного
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (String farmAnimal : farmAnimals) {
            String changedStrFarmAnimal = farmAnimal.replace(" ", ": ");
            sb.append(changedStrFarmAnimal);
            sb.append("\n");
        }

        String returnedStr = sb.toString();
        return returnedStr;
    }

}
