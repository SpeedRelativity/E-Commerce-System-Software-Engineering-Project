import java.util.Date;

public class Payment {
    private String paymentId;
    private Date paid;
    private double total;
    private String details;
    private Account account;

    public Payment(String paymentId, Date paid, double total, String details, Account account) {
        this.paymentId = paymentId;
        this.paid = new Date();
        this.total = total;
        this.details = details;
        this.account = account;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public Date getPaid() {
        return paid;
    }

    public double getTotal() {
        return total;
    }

    public String getDetails() {
        return details;
    }

    public Account getAccount() {
        return account;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
