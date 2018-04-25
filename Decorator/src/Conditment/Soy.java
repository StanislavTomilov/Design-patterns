package Conditment;

import Benerages.Benerage;

/**
 * Created by sbt-tomilov-si on 29/03/2018.
 */
public class Soy extends ConditmentDecorator {
    Benerage benerage;

    public Soy(Benerage benerage) {
        this.benerage = benerage;
    }

    @Override
    public String getDescription() {
        return benerage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + benerage.cost();
    }
}
