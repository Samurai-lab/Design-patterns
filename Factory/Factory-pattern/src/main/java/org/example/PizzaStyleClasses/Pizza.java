package org.example.PizzaStyleClasses;

import org.example.PizzaIngredientFactoryInterfaces.PizzaIngredientFactoryClasses.PizzaIngredientsInterfaces.*;

import java.util.Arrays;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    Clams clams;
    /*  protected ArrayList<String> toppings = new ArrayList<>();*/

    public abstract void prepare();
    /*{
        System.out.println("Preparing " + name);
        System.out.printf("""
                Tossing dough...
                Adding sauce...
                Adding toppings:
                """);
        for (String topping : toppings) System.out.println(" " + topping);

    }*/

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices ");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
         this.name = name;
    }

    public String toString() {
        return "Info about pizza:" +
                "\nName: " + name +
                "\nDough: " + dough +
                "\nSauce: " + sauce +
                "\nVeggies: " + Arrays.toString(veggies) +
                "\nCheese: " + cheese +
                "\nPepperoni: " + pepperoni +
                "\nClams: " + clams;
    }
}


