
public class Order {

    private final String orderNumber;
    private int counter = 0;
    private Date ordered;
    private Date shipped;
    private Address shippedTo;
    private OrderStatus status;
    private int total;

    public Order(){
        
    }

    enum OrderStatus {
        New,
        Hold,
        Shipped,
        Delivered,
        closed

    }

}
