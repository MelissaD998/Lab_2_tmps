package decoratorPattern;


import decoratorPattern.decor.Macarons;

public class LittleBakery {

    public static void main(String[] args) {
        Cake chocolateCake = new Chocolate();
        System.out.println("Chocolate cake: " + chocolateCake.getDescription() + " $" + chocolateCake.price());
        chocolateCake = new Macarons(chocolateCake);
        System.out.println("Chocolate cake with cream cheese: " + chocolateCake.getDescription() + " $" + chocolateCake.price());
    }
}
