package parking.refactored;

public class Vehicle {
    private final String plate;
    private final String type;
    private final Tariff tariff;

    public Vehicle(String plate, String type, Tariff tariff) {
        this.plate = plate;
        this.type = type;
        this.tariff = tariff;
    }

    public String getPlate() {
        return plate;
    }

    public String getType() {
        return type;
    }

    public Tariff getTariff() {
        return tariff;
    }
}
