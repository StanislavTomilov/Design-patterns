package Conditment;

import Benerages.Benerage;

/**
 * Created by sbt-tomilov-si on 29/03/2018.
 */
public class Mocha extends ConditmentDecorator {
    Benerage benerage;

    public Mocha(Benerage benerage) {
        this.benerage = benerage;
    }

    @Override
    public String getDescription() {
        return benerage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + benerage.cost();
    }
}
