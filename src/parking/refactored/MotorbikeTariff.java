package parking.refactored;

public class MotorbikeTariff implements Tariff {

    public double calculate(int hours) {
        return hours * 2.0;
    }
}
