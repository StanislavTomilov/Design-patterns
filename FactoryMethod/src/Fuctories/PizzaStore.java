package Fuctories;

import Products.Pizza;

/**
 * Created by sbt-tomilov-si on 03/04/2018.
 */
public abstract class PizzaStore  {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract public Pizza createPizza(String type);
}
