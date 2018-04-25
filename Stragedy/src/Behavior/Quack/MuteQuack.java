package Behavior.Quack;

/**
 * Created by sbt-tomilov-si on 26/03/2018.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silance>>");
    }
}
