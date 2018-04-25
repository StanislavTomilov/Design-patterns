package Conditment;

import Benerages.Benerage;

/**
 * Created by sbt-tomilov-si on 29/03/2018.
 */
public class Whip extends ConditmentDecorator {
    Benerage benerage;

    public Whip(Benerage benerage) {
        this.benerage = benerage;
    }

    @Override
    public String getDescription() {
        return benerage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + benerage.cost();
    }
}
