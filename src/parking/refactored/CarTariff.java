package parking.refactored;

public class CarTariff implements Tariff {

    public double calculate(int hours) {
        return hours * 5.0;
    }
}
