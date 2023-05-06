package facadePattern;

public class CoffeeMachineImpl implements CoffeeMachine {
    @Override
    public void prepareEspresso() {
        System.out.println("Preparing espresso...");
    }

    @Override
    public void prepareAmericano() {
        System.out.println("Preparing americano...");
    }

    @Override
    public void prepareCappuccino() {
        System.out.println("Preparing cappuccino...");
    }

    @Override
    public void addMilk() {
        System.out.println("Adding milk...");
    }

    @Override
    public void addSugar() {
        System.out.println("Adding sugar...");
    }

    @Override
    public void addCinnamon() {
        System.out.println("Adding cinnamon...");
    }
}
