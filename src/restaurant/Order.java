package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int nextSeq = 1;
    private int orderId;
    private Customer customer;
    private List<MenuItem> items;
    private long totalAmount;

    public Order(Customer customer) {
        this.orderId = nextSeq++;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalAmount = 0;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public void calculateTotal() {
        long sum = 0;
        for (MenuItem m : items) {
            sum += m.getPrice();
        }
        customer.addLoyaltyPoints(sum);
        double discount = customer.getDiscount();
        long discountAmount = (long) (sum * discount);
        this.totalAmount = sum - discountAmount;
    }

    public String getOrderSummary() {
        String names = "";
        for (int i = 0; i < items.size(); i++) {
            names += items.get(i).getName();
            if (i < items.size() - 1) {
                names += " - ";
            }
        }
        return "Order ID: " + orderId + ", Customer: " + customer.getName() +
                ", Total Amount: " + totalAmount + "\nItems: " + names;
    }

}
