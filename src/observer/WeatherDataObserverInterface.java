package observer;

import java.util.ArrayList;

public interface WeatherDataObserverInterface {
void update(ArrayList<Float> temperature, ArrayList<Float> humidity, float windSpeed, boolean isRain, boolean isSnow);

}
