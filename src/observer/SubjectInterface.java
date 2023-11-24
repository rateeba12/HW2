package observer;

public interface SubjectInterface {
     void add(WeatherDataObserverInterface observer);
     void remove (WeatherDataObserverInterface observer);
     void notifyAllObservers();
}
