package parking.refactored;

public interface RefundablePaymentMethod extends PaymentMethod {
    void refund(double amount);
}
