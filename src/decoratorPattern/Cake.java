package decoratorPattern;

public abstract class Cake {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double price();
}
