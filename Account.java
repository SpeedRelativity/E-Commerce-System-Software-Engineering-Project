import java.util.Date;

public class Account {

	private final String accountId;
	private static int counter = 0;

	private Address billingAddress;
	private boolean isClosed;
	private Date openDate;
	private Date closedDate;
	private ShoppingCart shoppingCart;
	private Order[] orders;
	private Customer customer;
	private Payment[] payments;

	private int orderCount;
	private int paymentCount;
	int initial_arr_size = 10;

	public Account(Customer customer) {
		this.accountId = "ACCOUNT_" + counter++; // so it's like 1..2..3
		this.customer = customer;
		this.billingAddress = null; // we shouldn't ask for billing address right away to a customer i think.
		this.isClosed = false;
		this.openDate = new Date();
		this.closedDate = null;
		this.shoppingCart = new ShoppingCart(this);
		this.orders = new Order[initial_arr_size];
		this.payments = new Payment[initial_arr_size];
		this.orderCount = 0;
		this.paymentCount = 0;

	};

	// getters

	public String getAccountId() {
		return accountId;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public Date getClosedDate() {
		return closedDate;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public Order[] getOrders() {
		return orders.clone();
	}

	public Payment[] getPayments() {
		return payments.clone();

	}

	public Customer getCustomer() {
		return customer;
	}

	// setters

	public void setBillingAddress(Address billAdd) {
		this.billingAddress = billAdd;
	}

	public void closeAccount() {
		if (this.isClosed != true) {
			this.isClosed = true;
			this.closedDate = new Date();
		}
	}

	public void addOrder(Order order) {
		if (order == null) {
			throw new NullPointerException("order cant be null.");
		}

		if (orderCount >= orders.length) {
			extendOrders();
		}
		for (int i = 0; i < orderCount; i++) {
			if (orders[i] == order) {
				throw new IllegalArgumentException("Duplicate order");
			}
		}
		// if no duplicate, then we add the new order to the index of the total + 1.
		orders[orderCount] = order;
		orderCount++;

	}

	public void addPayment(Payment payment) {
		if (payment == null) {
			throw new NullPointerException("payment cannot be null");
		}
		if (paymentCount >= payments.length) {
			extendPayments();
		}
		for (int i = 0; i < paymentCount; i++) {
			if (payments[i] == payment) {
				throw new IllegalArgumentException("Duplicate payment");
			}
		}
		payments[paymentCount] = payment;
		paymentCount++;
	}

	public void extendPayments() {
		Payment[] newPayments = new Payment[payments.length * 2];
		for (int i = 0; i < payments.length; i++) {
			newPayments[i] = payments[i];
		}
		payments = newPayments;
	}

	public void extendOrders() {
		Order[] newOrders = new Order[orders.length * 2];
		for (int i = 0; i < orders.length; i++) {
			newOrders[i] = orders[i];
		}

		orders = newOrders;

	}

}
