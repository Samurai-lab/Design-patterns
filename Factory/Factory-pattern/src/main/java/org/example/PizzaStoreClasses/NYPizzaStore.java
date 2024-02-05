package org.example.PizzaStoreClasses;

import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactoryClasses.NYPizzaIngredientFactory;
import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactory;
import org.example.PizzaStyleClasses.NYStyleCheesePizza;
import org.example.PizzaStyleClasses.Pizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new NYStyleCheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
