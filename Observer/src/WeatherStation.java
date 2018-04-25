import Observer.CurrentConditionsDisplay;
import Subject.WeatherData;

/**
 * Created by sbt-tomilov-si on 27/03/2018.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(10, 65, 30.4f);
        weatherData.setMeasurements(15, 87, 29.2f);
        weatherData.setMeasurements(20, 77, 30.9f);
    }
}
