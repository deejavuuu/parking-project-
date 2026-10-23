package parking.refactored;

public class ParkingServiceTest {
    public static void main(String[] args) throws Exception {
        ParkingLogger dummyLogger = line -> {
        };
        ReportFormatter formatter = new StandardReportFormatter();
        ParkingService service = new ParkingService(dummyLogger, formatter);

        Vehicle car = new Vehicle("12345-A-6", "CAR", new CarTariff());
        Vehicle bike = new Vehicle("67890-B-1", "MOTORBIKE", new MotorbikeTariff());
        Vehicle truck = new Vehicle("24680-D-8", "TRUCK", new TruckTariff());

        if (service.fee(car, 3) != 15.0) {
            throw new AssertionError("Car fee mismatch");
        }
        if (service.fee(bike, 2) != 4.0) {
            throw new AssertionError("Bike fee mismatch");
        }
        if (service.fee(truck, 4) != 60.0) {
            throw new AssertionError("Truck fee mismatch");
        }

        RefundablePaymentMethod card = new CardPayment("4242");
        PaymentMethod cash = new CashPayment();

        service.checkout(car, 3, card);
        service.checkout(bike, 2, cash);
        service.checkout(truck, 4, card);

        service.cancelAtDesk(bike, 2);
        service.cancel(truck, 4, card);

        if (service.getTotal() != 15.0) {
            throw new AssertionError("Total mismatch: " + service.getTotal());
        }

        if (!service.dailyReport().contains("Total: 15.0 MAD")) {
            throw new AssertionError("Report total mismatch");
        }

        System.out.println("Tests passed successfully.");
    }
}
