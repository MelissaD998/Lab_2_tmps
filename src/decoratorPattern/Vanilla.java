package decoratorPattern;

public class Vanilla extends Cake {

    public Vanilla() {
        description = "Vanilla";
    }

    @Override
    public double price() {
        return 100.00;
    }
}
