package Products;

/**
 * Created by sbt-tomilov-si on 04/04/2018.
 */
public class ChicagoPizza extends Pizza {
    public ChicagoPizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into squre slices");
    }
}
