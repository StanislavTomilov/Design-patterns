package Benerages;

import Benerages.Benerage;

/**
 * Created by sbt-tomilov-si on 29/03/2018.
 */
public class HouseBlend extends Benerage {

    public HouseBlend() {
        description = "House Blend Coffe";
    }

    @Override
    public double cost() {
        return .89;
    }
}
