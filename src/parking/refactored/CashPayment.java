package parking.refactored;

public class CashPayment implements PaymentMethod {

    public String name() {
        return "CASH";
    }

    public void pay(double amount) {
        System.out.println("[CASH] received " + amount + " MAD");
    }
}
