package compositePattern;

import java.util.List;

public class IndividualAnimal implements Animal{
    private String name;

    public IndividualAnimal(String name) {
        this.name = name;
    }

    @Override
    public String showName() {
        return name;
    }

    @Override
    public List<Animal> getAnimals() {
        return null;
    }
}
