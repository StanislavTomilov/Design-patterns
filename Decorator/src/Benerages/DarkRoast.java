package Benerages;

import Benerages.Benerage;

/**
 * Created by sbt-tomilov-si on 29/03/2018.
 */
public class DarkRoast extends Benerage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
