package IngredientFactory;

/**
 * Created by sbt-tomilov-si on 06/04/2018.
 */
public interface PizzaIngredientFactory {
    public Dough createDought();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
