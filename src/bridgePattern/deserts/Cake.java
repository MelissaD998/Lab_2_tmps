package bridgePattern.deserts;


import bridgePattern.ingredients.Ingredients;

public class Cake extends Desert {

    public Cake(Ingredients ingredients) {
        super(ingredients);
    }

    @Override
    public void display() {
        System.out.println("Cake with " + ingredients.getIngredients());
    }
}
