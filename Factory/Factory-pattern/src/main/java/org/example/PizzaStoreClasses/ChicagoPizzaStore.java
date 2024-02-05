package org.example.PizzaStoreClasses;

import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactory;
import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactoryClasses.ChicagoPizzaIngredientFactory;
import org.example.PizzaStyleClasses.ChicagoStyleCheesePizza;
import org.example.PizzaStyleClasses.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        return pizza;
    }
}
