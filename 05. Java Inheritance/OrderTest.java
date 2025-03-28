import java.util.Scanner;

class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class OrderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        String orderId = sc.nextLine();
        System.out.print("Enter Order Date: ");
        String orderDate = sc.nextLine();
        Order order = new Order(orderId, orderDate);
        System.out.println(order.getOrderStatus());
        System.out.print("Enter Shipped Tracking Number: ");
        String trackingNumber = sc.nextLine();
        ShippedOrder shippedOrder = new ShippedOrder(orderId, orderDate, trackingNumber);
        System.out.println(shippedOrder.getOrderStatus());
        System.out.print("Enter Delivery Date: ");
        String deliveryDate = sc.nextLine();
        DeliveredOrder deliveredOrder = new DeliveredOrder(orderId, orderDate, trackingNumber, deliveryDate);
        System.out.println(deliveredOrder.getOrderStatus());
    }
}