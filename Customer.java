public class Customer {
	private final String customerId;
	private static int counter = 1;
	private Address address;
	private Phone phone;
	private String email;
	private Account account;

	public Customer(Address address, Phone phone, String email) {
		this.customerId = "CUSTOMER_" + counter++;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.account = new Account(this);
	}

	public String getId() {
		return customerId;
	}

	public String getEmail() {
		return email;
	}

	public Address getAddress() {
		return address;
	}

	public String getPhone() {
		return phone.getNumber();
	}

	public Account getAccount() {
		return account;
	}

	public void setAddress(Address addy) {
		this.address = addy;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
