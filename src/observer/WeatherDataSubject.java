package observer;

import decorator.decoratorInterface;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements SubjectInterface , decoratorInterface {
    ArrayList <Float> temperatureList ;
    ArrayList <Float> humidityList;
    float windSpeed;
    boolean isRain;
    boolean isSnow;
    List <WeatherDataObserverInterface> observerList;

    public WeatherDataSubject(float temperature, float humidity, float windSpeed, boolean isRain, boolean isSnow, List<WeatherDataObserverInterface> observerList) {
        this.temperatureList.add(temperature);
        this.humidityList.add(humidity);
        this.windSpeed = windSpeed;
        this.isRain = isRain;
        this.isSnow = isSnow;
        this.observerList = observerList;
    }

    public  float getTemperature() {
        return this.temperatureList.indexOf(this.temperatureList.size() -1);
    }

    @Override
    public void add(WeatherDataObserverInterface observer) {
        observerList.add(observer);

    }

    @Override
    public void remove(WeatherDataObserverInterface observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifyAllObservers() {
        for ( WeatherDataObserverInterface observer :observerList){
            observer.update( temperatureList,  humidityList,  windSpeed,  isRain, isSnow);
        }

    }

}
