package org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactoryClasses;

import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactory;
import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactoryClasses.PizzaIngredientsInterfaces.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return null;
    }
}
