import Fuctories.ChicagoPizzaStore;
import Fuctories.NYPizzaStore;
import Fuctories.PizzaStore;
import Products.Pizza;

/**
 * Created by sbt-tomilov-si on 04/04/2018.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
