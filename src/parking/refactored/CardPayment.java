package parking.refactored;

public class CardPayment implements RefundablePaymentMethod {
    private final String lastDigits;

    public CardPayment(String lastDigits) {
        this.lastDigits = lastDigits;
    }

    public String name() {
        return "CARD";
    }

    public void pay(double amount) {
        System.out.println("[CARD ****" + lastDigits + "] paid " + amount + " MAD");
    }

    public void refund(double amount) {
        System.out.println("[CARD ****" + lastDigits + "] refunded " + amount + " MAD");
    }
}
