package Fuctories;

import Products.NYCheesePizza;
import Products.Pizza;

/**
 * Created by sbt-tomilov-si on 03/04/2018.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else if (type.equals("veggie")) {
            //return new NYVeggiePizza();
            return null;
        } else if(type.equals("clam")) {
            //return new NYClamPizza();
            return null;
        } else if (type.equals("pepperoni")) {
            //return new NYPeperoniPizza();
            return null;
        } else {
            return null;
        }
    }
}
