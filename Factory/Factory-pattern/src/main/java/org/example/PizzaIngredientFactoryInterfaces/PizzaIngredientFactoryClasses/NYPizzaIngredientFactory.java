package org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactoryClasses;

import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactory;
import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactoryClasses.PizzaIngredientsInterfaces.*;
import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactoryClasses.PizzaIngredientsInterfaces.PizzaIngredientsIClasses.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
