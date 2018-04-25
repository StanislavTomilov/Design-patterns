package Singletone;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    public static ChocolateBoiler boiler = new ChocolateBoiler();

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        return boiler;
    }

    /*
    pubic static Singletone.ChocolateBoiler getInstance() {
        if (boiler == null) {
            boiler = new Singletone.ChocolateBoiler;
        }
        return boiler;
    }
     */

    /*
    pubic satic Singletone.ChocolateBoiler getInstance() {
        if (boiler == null) {
            synchronized (Chocolate.class) {
                if ( boiler == null) {
                    boiler = new Singletone.ChocolateBoiler;
                }
            }
        }
        return boiler;
    }
    */

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

}
