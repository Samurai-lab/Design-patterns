package org.example;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.VENTI);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription()
                + " $ " + beverage.cost());
    }
}