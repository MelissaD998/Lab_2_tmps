package bridgePattern.deserts;

import bridgePattern.ingredients.Ingredients;

public class Cupcake extends Desert {

    public Cupcake(Ingredients ingredients) {
        super(ingredients);
    }

    @Override
    public void display() {
        System.out.println("Cupcake with " + ingredients.getIngredients());
    }
}
