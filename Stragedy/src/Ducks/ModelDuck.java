package Ducks;

import Behavior.Fly.FlyNoWay;
import Behavior.Quack.Quack;

/**
 * Created by sbt-tomilov-si on 26/03/2018.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
