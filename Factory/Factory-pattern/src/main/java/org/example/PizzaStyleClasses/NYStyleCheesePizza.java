package org.example.PizzaStyleClasses;

import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactoryClasses.PizzaIngredientsInterfaces.Clams;
import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        Clams clam = ingredientFactory.createClam();
    }
}
