package parking.refactored;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ParkingLogger logger = new FileLogger("parking.log");
        ReportFormatter formatter = new StandardReportFormatter();
        ParkingService garage = new ParkingService(logger, formatter);

        Vehicle car = new Vehicle("12345-A-6", "CAR", new CarTariff());
        Vehicle bike = new Vehicle("67890-B-1", "MOTORBIKE", new MotorbikeTariff());
        Vehicle truck = new Vehicle("24680-D-8", "TRUCK", new TruckTariff());

        RefundablePaymentMethod card = new CardPayment("4242");
        PaymentMethod cash = new CashPayment();

        garage.checkout(car, 3, card);
        garage.checkout(bike, 2, cash);
        garage.checkout(truck, 4, card);

        garage.cancelAtDesk(bike, 2);
        garage.cancel(truck, 4, card);

        System.out.println(garage.dailyReport());
    }
}
