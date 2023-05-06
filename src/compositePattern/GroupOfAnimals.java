package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class GroupOfAnimals implements Animal {
    private String name;
    private List<Animal> animals;

    public GroupOfAnimals(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public String showName() {
        return name;
    }

    @Override
    public List<Animal> getAnimals() {
        return animals;
    }
}
