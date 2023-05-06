package facadePattern;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        CoffeeMachine coffeeMachine = new CoffeeMachineImpl();
        CoffeeFacade coffeeFacade = new CoffeeFacade(coffeeMachine);

        System.out.println("Selected coffee: espresso.");
        coffeeFacade.prepareEspresso();
        System.out.println("----------------------------------");
        Thread.sleep(2000);
        System.out.println("Selected coffee: cappuccino with sugar.");
        coffeeFacade.prepareCappuccinoWithSugar();
        System.out.println("----------------------------------");
        Thread.sleep(5000);
        System.out.println("Selected coffee: latte.");
        coffeeFacade.prepareLatte();
        System.out.println("----------------------------------");
        Thread.sleep(10000);
        System.out.println("Selected coffee: cinnamon latte.");
        coffeeFacade.prepareCinnamonLatte();
    }
}
