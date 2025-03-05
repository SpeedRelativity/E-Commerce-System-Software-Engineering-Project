import java.util.Date;

public class Order {

    private final String orderNumber;
    private Date ordered;
    private Date shipped;
    private Address shipTo;
    private OrderStatus status;
    private double total;
    private LineItem[] lineItems;
    private Payment[] payments;
    private Account account;

    private int lineItemsCount;
    private int paymentCount;
    private int InitialArraySize = 10;

    public Order(String orderNumber, Address shipTo, Account account) {
        this.orderNumber = orderNumber;
        this.ordered = new Date();
        this.shipTo = shipTo;
        this.account = account;
        this.lineItems = new LineItem[InitialArraySize];
        this.payments = new Payment[InitialArraySize];
        this.lineItemsCount = 0;
        this.paymentCount = 0;
        this.total = 0;
    }

    enum OrderStatus {
        New,
        Hold,
        Shipped,
        Delivered,
        closed

    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderedDate() {
        return ordered;
    }

    public Date getShippedDate() {
        return shipped;
    }

    public Address getShipTo() {
        return shipTo;
    }

    public double getTotal() {
        return total;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public Payment[] getPayments() {
        return payments;
    }

    public Account getAccount() {
        return account;
    }

    public void addLineItem(LineItem lineItem) {
        if (lineItemsCount >= lineItems.length) {
            extendLineItems();
        }

        // self note if duplicate then we need to increase quantity here.
        for (int i = 0; i < lineItemsCount; i++) {
            if (lineItems[i].getProduct().equals(lineItem.getProduct())) {

                lineItems[i].setQuantity(lineItem.getQuantity() + lineItem.getQuantity()); // we're adding whatever line
                                                                                           // amount + the new line
                                                                                           // amount.
            }
        }

        lineItems[lineItemsCount] = lineItem;
        total += lineItem.getPrice();
        lineItemsCount++;

    }

    public void addPayment(Payment payment) {
        if (paymentCount >= payments.length) {
            extendPayments();
        }

        payments[paymentCount] = payment;
        paymentCount++;
    }

    public void extendLineItems() {
        LineItem[] newLineItems = new LineItem[lineItems.length * 2];
        for (int i = 0; i < lineItems.length; i++) {
            newLineItems[i] = lineItems[i];
        }
        lineItems = newLineItems;

    }

    public void extendPayments() {
        Payment[] newPayments = new Payment[payments.length * 2];
        for (int i = 0; i < payments.length; i++) {
            newPayments[i] = payments[i];
        }
        payments = newPayments;
    }

}
