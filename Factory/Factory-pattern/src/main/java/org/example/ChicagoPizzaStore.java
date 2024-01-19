package org.example;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            default -> null;
        };
    }
}
