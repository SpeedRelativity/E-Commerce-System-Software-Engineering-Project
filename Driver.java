import java.util.Date;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Let's try creating account from Webuser.");
        // gathering basic information.
        String username = "speedrelativity";
        String password = "1234567890";
        Address address1 = new Address("1270 Hayward St", "SomeCity", "SomeState", "12345");
        Date date1 = new Date();
        Phone phoneNum = new Phone("4156106914");
        String email = "someemail@gmail.com";

        Customer newCustomer = new Customer(address1, phoneNum, email);

        WebUser Nechar = new WebUser();

        // Webuser testing...
        Nechar.setCustomer(newCustomer);
        Nechar.setLoginId(username);
        Nechar.setPassword(password);
        System.out.println("Webuser created successfully.");

        // Account testing...
        Account account = new Account(newCustomer);
        System.out.println("Account created successfully.");
        System.out.println("Customer ID: " + newCustomer.getId());
        System.out.println("Customer Email: " + newCustomer.getEmail());
        System.out.println("Customer Address: " + newCustomer.getAddress());
        System.out.println("Customer Phone: " + newCustomer.getPhone());
        System.out.println("Account ID: " + account.getAccountId());
        System.out.println("Account Open Date: " + account.getOpenDate());
        account.closeAccount();
        System.out.println("Account closed successfully.");

        // ShoppingCart testing...
        System.out.println("Creating a product...");
        Product product = new Product("iPhone", "Apple");
        Product product2 = new Product("Macbook", "Apple");
        System.out.println("Product created successfully.");

        LineItem item1 = new LineItem(product, 5, 1000);
        LineItem item2 = new LineItem(product2, 3, 1500);

        ShoppingCart cart = new ShoppingCart(account);
        System.out.println("ShoppingCart created successfully.");
        cart.addLineItem(item2);
        cart.addLineItem(item1);
        System.out.println("Shopping Cart Creation Date: " + cart.getCreated());
        System.out.println("Line Item Count: " + cart.getLineItems().length);

        // Order testing...
        
        Order order = new Order("1", address1, account);
        System.out.println("Order created successfully.");
        order.addLineItem(item1);
        order.addLineItem(item2);
        System.out.println("Order Number: " + order.getOrderNumber());
        System.out.println("Order Ship To: " + order.getShipTo());
        System.out.println("Order Total: " + order.getTotal());

        // Payment testing...
        
        Payment payment1 = new Payment("P123", date1, order.getTotal(), "Credit Card", account);
        order.addPayment(payment1);
        System.out.println("Payment added to order successfully.");
        System.out.println("Payment ID: " + payment1.getPaymentId());
        System.out.println("Payment Total: " + payment1.getTotal());

    }
}
