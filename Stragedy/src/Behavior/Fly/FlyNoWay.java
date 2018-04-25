package Behavior.Fly;

/**
 * Created by sbt-tomilov-si on 26/03/2018.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
