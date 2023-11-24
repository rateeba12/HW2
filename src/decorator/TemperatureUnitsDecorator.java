package decorator;


import observer.WeatherDataSubject;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TemperatureUnitsDecorator  extends Decorators{


    protected TemperatureUnitsDecorator(decoratorInterface decoratorinterface) {
        super(decoratorinterface);
    }

    public static void display() {
        Decorators.display();
        System.out.println("Temperature: ");
    }

    public void convertTemperature() {
        WeatherDataSubject weatherdatasubject = null;
        float temperature = weatherdatasubject.getTemperature();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the unit :");
        String unit = scanner.nextLine();
        System.out.println( isFahrenheit(unit) ? (temperature * 9 / 5) + 32 : temperature + unit);
    }

    private boolean isFahrenheit(String unit) {
        return Objects.equals(unit, "Fahrenheit");
    }
}
