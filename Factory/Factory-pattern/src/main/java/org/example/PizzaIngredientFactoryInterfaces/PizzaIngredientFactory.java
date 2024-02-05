package org.example.PizzaIngredientFactoryInterfaces;

import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactoryClasses.PizzaIngredientsInterfaces.*;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
