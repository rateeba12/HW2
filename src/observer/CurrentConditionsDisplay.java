package observer;

import java.util.ArrayList;
import java.util.logging.Logger;

public class CurrentConditionsDisplay implements  WeatherDataObserverInterface{

    Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void update(ArrayList<Float> temperature, ArrayList<Float> humidity, float windSpeed, boolean isRain, boolean isSnow) {
        logger.info("Current Conditions: Temperature " + temperature.get(temperature.size() - 1)
                + "°C, Humidity " + humidity.get(humidity.size() -1)
                + "%, Wind Speed "
                + windSpeed + " km/h");

    }

}
