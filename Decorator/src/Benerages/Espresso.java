package Benerages;

import Benerages.Benerage;

/**
 * Created by sbt-tomilov-si on 29/03/2018.
 */
public class Espresso extends Benerage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
