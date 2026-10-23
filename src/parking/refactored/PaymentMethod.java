package parking.refactored;

public interface PaymentMethod {
    String name();

    void pay(double amount);
}
