package org.example;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return switch (beverage.getSize()) {
            case TALL -> .5 + beverage.cost();
            case GRANDE -> .10 + beverage.cost();
            case VENTI -> .15 + beverage.cost();
        };
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
