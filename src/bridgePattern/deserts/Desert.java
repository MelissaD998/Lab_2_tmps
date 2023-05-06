package bridgePattern.deserts;

import bridgePattern.ingredients.Ingredients;

public abstract class Desert {
    protected Ingredients ingredients;
    public Desert(Ingredients ingredients) {
        this.ingredients = ingredients;
    }
    public abstract void display();
}
