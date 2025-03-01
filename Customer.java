public class Customer {
	private String customerId;
	private Address address;
	private Phone phone;
	private String email;
	private Account account;
	
	
	public Customer(String id, Address address, Phone phone, String email) {
        this.customerId = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.account = new Account();
    }
	
	public String getId() {
		return customerId;
	}
	
	public String getEmail() {
		return email;
	}
	public Address getAddress(){
		return address;
	}
	public Phone getPhone() {
		return phone;
	}
	
	public Account getAccount() {
		return account;
	}
	
	
	
}
