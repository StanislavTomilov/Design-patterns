import Behavior.Fly.FlyRocketPowered;
import Ducks.Duck;
import Ducks.MallardDuck;
import Ducks.ModelDuck;

/**
 * Created by sbt-tomilov-si on 26/03/2018.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
