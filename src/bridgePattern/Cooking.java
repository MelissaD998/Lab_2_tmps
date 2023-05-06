package bridgePattern;

import bridgePattern.deserts.Cake;
import bridgePattern.deserts.Cupcake;
import bridgePattern.deserts.Desert;
import bridgePattern.ingredients.Chocolate;
import bridgePattern.ingredients.Fruit;
import bridgePattern.ingredients.Ingredients;

public class Cooking {
    public static void main(String[] args) {
        Ingredients chocolate = new Chocolate();
        Ingredients fruit = new Fruit();

        Desert chocolateCake = new Cake(chocolate);
        Desert fruitCake = new Cake(fruit);

        Desert chocolateCupcake = new Cupcake(chocolate);
        Desert fruitCupcake = new Cupcake(fruit);

        System.out.println("Chocolate Deserts:");
        chocolateCake.display();
        chocolateCupcake.display();

        System.out.println("\nFruit Deserts:");
        fruitCake.display();
        fruitCupcake.display();
    }
}
