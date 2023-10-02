package org.example;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return switch (beverage.getSize()) {
            case TALL -> .15 + beverage.cost();
            case GRANDE -> .20 + beverage.cost();
            case VENTI -> .25 + beverage.cost();
        };
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
