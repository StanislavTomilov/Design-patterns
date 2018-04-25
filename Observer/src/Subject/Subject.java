package Subject;

import Observer.Observer;

/**
 * Created by sbt-tomilov-si on 27/03/2018.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObserver();
}
