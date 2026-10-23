package parking.refactored;

public class TruckTariff implements Tariff {

    public double calculate(int hours) {
        return 20 + hours * 10.0;
    }
}
