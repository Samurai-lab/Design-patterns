package org.example;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return switch (beverage.getSize()) {
            case TALL -> .10 + beverage.cost();
            case GRANDE -> .15 + beverage.cost();
            case VENTI -> .20 + beverage.cost();
        };
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
