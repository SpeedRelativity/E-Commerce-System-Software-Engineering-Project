import java.util.Date;

public class ShoppingCart {

	private Date created;
	private LineItem[] lineItems;
	private Account account;
	private int lineItemsCount;
	private int initialArraySize = 10;

	public ShoppingCart(Account account) {
		this.created = new Date();
		this.account = account;
		this.lineItems = new LineItem[initialArraySize];
		this.lineItemsCount = 0;

	}

	public Date getCreated() {
		return created;
	}

	public LineItem[] getLineItems() {
		return lineItems;
	}

	public Account getAccount() {
		return account;
	}

	public void addLineItem(LineItem lineItem) {
		if (lineItemsCount >= lineItems.length) {
			extendLineItems();
		}

		lineItems[lineItemsCount] = lineItem;
		lineItemsCount++;

	}

	public void extendLineItems() {
		LineItem[] newLineItems = new LineItem[lineItems.length * 2];
		for (int i = 0; i < lineItems.length; i++) {
			newLineItems[i] = lineItems[i];
		}
		lineItems = newLineItems;

	}

}
