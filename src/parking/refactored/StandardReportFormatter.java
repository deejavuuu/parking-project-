package parking.refactored;

import java.util.List;

public class StandardReportFormatter implements ReportFormatter {

    public String formatReceipt(Vehicle vehicle, int hours, double amount, PaymentMethod method) {
        return vehicle.getPlate() + " | " + vehicle.getType() + " | "
                + hours + " h | " + amount + " MAD | " + method.name();
    }

    public String formatDailyReport(List<String> receipts, double total) {
        StringBuilder sb = new StringBuilder("=== Daily report ===\n");
        for (String receipt : receipts) {
            sb.append(receipt).append("\n");
        }
        sb.append("Total: ").append(total).append(" MAD");
        return sb.toString();
    }
}
