import Benerages.Benerage;
import Benerages.DarkRoast;
import Benerages.Espresso;
import Benerages.HouseBlend;
import Conditment.Mocha;
import Conditment.Soy;
import Conditment.Whip;

/**
 * Created by sbt-tomilov-si on 29/03/2018.
 */
public class StarbuzzCoffe {
    public static void main(String[] args) {
        Benerage benerage = new Espresso();
        System.out.println(benerage.getDescription() + " $" + benerage.cost());

        Benerage benerage1 = new DarkRoast();
        benerage1 = new Mocha(benerage1);
        benerage1 = new Mocha(benerage1);
        benerage1 = new Whip(benerage1);
        System.out.println(benerage1.getDescription() + " $" + benerage1.cost());

        Benerage benerage2 = new HouseBlend();
        benerage2 = new Soy(benerage2);
        benerage2 = new Mocha(benerage2);
        benerage2 = new Whip(benerage2);
        System.out.println(benerage2.getDescription() + " $" + benerage2.cost());
    }
}
