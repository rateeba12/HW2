package observer;

import java.util.ArrayList;
import java.util.logging.Logger;

public class StatisticsDisplay implements WeatherDataObserverInterface{
    private AverageCalculator temperatureAverage;
    private AverageCalculator humidityAverage;
    Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void update(ArrayList<Float> temperature, ArrayList<Float> humidity, float windSpeed, boolean isRain, boolean isSnow) {

        float averageTemperature = temperatureAverage.calculateAverage(temperature);
        float averageHumidity = humidityAverage.calculateAverage(humidity);
        logger.info("Average Temperature " + averageTemperature + "°C" + ", Average Humidity " + averageHumidity + "%");
    }


}
