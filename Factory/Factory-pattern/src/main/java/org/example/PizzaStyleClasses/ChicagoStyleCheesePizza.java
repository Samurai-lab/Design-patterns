package org.example.PizzaStyleClasses;

import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
       System.out.println("Preparing " + name);
       dough = ingredientFactory.createDough();
       sauce = ingredientFactory.createSauce();
       cheese = ingredientFactory.createCheese();
   }
}
