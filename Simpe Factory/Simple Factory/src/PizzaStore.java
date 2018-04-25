/**
 * Created by sbt-tomilov-si on 03/04/2018.
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare;
        pizza.bake;
        pizza.cut;
        pizza.box;
        return pizza;
    }

    //other methods
}
