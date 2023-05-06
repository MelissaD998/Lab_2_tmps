package facadePattern;

public class CoffeeFacade {
    private CoffeeMachine coffeeMachine;

    public CoffeeFacade(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void prepareEspresso() {
        coffeeMachine.prepareEspresso();
    }

    public void prepareCappuccinoWithSugar() {
        coffeeMachine.prepareCappuccino();
        coffeeMachine.addSugar();
    }

    public void prepareLatte() {
        coffeeMachine.prepareEspresso();
        coffeeMachine.addMilk();
    }

    public void prepareCinnamonLatte() {
        coffeeMachine.prepareEspresso();
        coffeeMachine.addMilk();
        coffeeMachine.addCinnamon();
    }
}
