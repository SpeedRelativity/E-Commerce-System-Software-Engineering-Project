public class Account {
	
	private final String accountId;
	private static int counter = 1;
	
	private Address billingAddress;
	private boolean isClosed;
	private Date openDate;
	private Date closedDate;
	private ShoppingCart[] shoppingCart;
	private Order[] orders;
	private Customer customer;
	private Payment[] payments;
	private int orderCount;
	private int paymentCount;
	
	int initial_arr_size = 10;
	
	
	public Account(Customer customer){
		this.accountId = "" + counter++; // so it's like 1..2..3
		this.customer = customer;
		this.billingAddress = new Address();
		this.isClosed = false;
		this.openDate = new Date();
		this.closedDate = null;
		this.shoppingCart = new ShoppingCart();
		this.orders = new Order[initial_arr_size];
		this.payments = new Payment[initial_arr_size];
		this.orderCount = 0;
		this.paymentCount = 0;
		
	};
	
	public String getId() {
		return accountId;
	}
	
	public Address getAddress() {
		return billingAddress;
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
	
	public Customer getCustomer() {
		return customer;
	}
	
	public Payment getPayments() {
		return payments;
	}
	
	public void setId(String id) {
		this.accountId = id;
	}
	
	public void setAddress(Address addy) {
		this.billingAddress = addy;
	}
	
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	
	public void setCloseDate(Date closeDate) {
		this.closedDate = closeDate;
	}
	
	public void setShoppingCart(ShoppingCart cart) {
		this.shoppingCart = cart;
	}
	
	public Order addOrder() {
		return orders;
	}
	
	
	
	
}
