package compositePattern;

public class AnimalHierarchy {

    public static void main(String[] args) {
        GroupOfAnimals animals = new GroupOfAnimals("Animals");
        GroupOfAnimals carnivores = new GroupOfAnimals("Carnivores");
        GroupOfAnimals herbivores = new GroupOfAnimals("Herbivores");

        IndividualAnimal lion = new IndividualAnimal("Lion");
        IndividualAnimal tiger = new IndividualAnimal("Tiger");
        IndividualAnimal gazelle = new IndividualAnimal("Gazelle");
        IndividualAnimal zebra = new IndividualAnimal("Zebra");

        carnivores.addAnimal(lion);
        carnivores.addAnimal(tiger);
        herbivores.addAnimal(gazelle);
        herbivores.addAnimal(zebra);

        animals.addAnimal(carnivores);
        animals.addAnimal(herbivores);

        displayAnimalHierarchy(animals, "");
    }

    public static void displayAnimalHierarchy(Animal animal, String prefix) {
        System.out.println(prefix + animal.showName());
        if (animal.getAnimals() != null) {
            for (Animal subAnimal : animal.getAnimals()) {
                displayAnimalHierarchy(subAnimal, prefix + "-");
            }
        }
    }
}
