package decoratorPattern;

public class Chocolate extends Cake {

    public Chocolate() {
        description = "Chocolate";
    }

    @Override
    public double price() {
        return 200.00;
    }
}
