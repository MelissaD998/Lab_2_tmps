package decoratorPattern.decor;


import decoratorPattern.Cake;

public class Strawberry extends Decor {

    Cake cake;

    public Strawberry(Cake cake) {
        this.cake = cake;
    }

    @Override
    public double price() {
        return cake.price() + 50.00;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Strawberry";
    }
}
