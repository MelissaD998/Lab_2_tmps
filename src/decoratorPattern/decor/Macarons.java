package decoratorPattern.decor;


import decoratorPattern.Cake;

public class Macarons extends Decor {

    Cake cake;

    public Macarons(Cake cake) {
        this.cake = cake;
    }

    @Override
    public double price() {
        return cake.price() + 150.00;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Macarons";
    }
}
