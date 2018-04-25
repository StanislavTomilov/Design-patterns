package Benerages;

/**
 * Created by sbt-tomilov-si on 29/03/2018.
 */
public abstract class Benerage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
