package observer;

import java.util.ArrayList;

public class AveragrCalculate implements AverageCalculator {
    @Override
    public float calculateAverage(ArrayList<Float> arrayList) {
        float sum = 0;
        for (float item : arrayList) {
            sum += item;
        }

        return sum / arrayList.size();    }
}
