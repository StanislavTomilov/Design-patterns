package Ducks;

import Behavior.Fly.FlyWithWings;
import Behavior.Quack.Quack;

/**
 * Created by sbt-tomilov-si on 26/03/2018.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
