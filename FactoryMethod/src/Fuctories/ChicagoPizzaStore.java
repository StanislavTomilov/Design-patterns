package Fuctories;

import Products.ChicagoPizza;
import Products.Pizza;

/**
 * Created by sbt-tomilov-si on 03/04/2018.
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoPizza();
        } else if (type.equals("veggie")) {
            //return new ChicagoVeggiePizza();
            return null;
        } else if (type.equals("clam")) {
            //return  new ChicagoClamPizza;
            return null;
        } else {
            return null;
        }
    }
}
