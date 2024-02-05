package org.example;

import org.example.PizzaStoreClasses.ChicagoPizzaStore;
import org.example.PizzaStoreClasses.NYPizzaStore;
import org.example.PizzaStoreClasses.PizzaStore;
import org.example.PizzaStyleClasses.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}