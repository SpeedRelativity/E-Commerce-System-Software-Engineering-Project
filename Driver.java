public class Driver {
    public static void main(String[] args) {
        // Placeholder objects for dependencies
        Address address = new Address("B Street","Hayward", "california", "94580"); // Assuming Address has a default constructor
        Phone phone = new Phone();       // Assuming Phone has a default constructor

        // Step 1: Create a Customer
        System.out.println("Creating a new customer...");
        Customer customer = new Customer("CUST001", address, phone, "customer@example.com");

        // Step 2: Test Customer Getters
        System.out.println("Testing Customer Getters:");
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Email: " + customer.getEmail());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Customer Phone: " + customer.getPhone());

        // Step 3: Test Account Creation
        System.out.println("\nTesting Account Creation:");
        Account account = customer.getAccount();
        System.out.println("Account ID: " + account.getAccountId());
        System.out.println("Account Open Date: " + account.getOpenDate());
        System.out.println("Is Account Closed? " + account.isClosed());

        // Step 4: Test Adding Orders to Account
        System.out.println("\nTesting Adding Orders to Account:");
        Order order1 = new Order(); // Placeholder order object
        Order order2 = new Order(); // Another placeholder order object

        try {
            account.addOrder(order1);
            System.out.println("Order 1 added successfully!");
            account.addOrder(order2);
            System.out.println("Order 2 added successfully!");

            // Attempt to add a duplicate order (should throw an exception)
            account.addOrder(order1);
            System.out.println("Duplicate order added (this should NOT happen).");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception for duplicate order: " + e.getMessage());
        }

        // Step 5: Test Adding Payments to Account
        System.out.println("\nTesting Adding Payments to Account:");
        Payment payment1 = new Payment(); // Placeholder payment object
        Payment payment2 = new Payment(); // Another placeholder payment object

        try {
            account.addPayment(payment1);
            System.out.println("Payment 1 added successfully!");
            account.addPayment(payment2);
            System.out.println("Payment 2 added successfully!");

            // Attempt to add a duplicate payment (should throw an exception)
            account.addPayment(payment1);
            System.out.println("Duplicate payment added (this should NOT happen).");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception for duplicate payment: " + e.getMessage());
        }

        // Step 6: Test Closing the Account
        System.out.println("\nTesting Closing the Account:");
        account.closeAccount();
        System.out.println("Account closed successfully!");
        System.out.println("Is Account Closed? " + account.isClosed());
        
    }
}
