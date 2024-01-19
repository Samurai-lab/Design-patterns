package org.example;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new NYStyleCheesePizza();
            default -> null;
        };
    }
}
