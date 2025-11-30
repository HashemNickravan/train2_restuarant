package restaurant;

public class Customer extends Person {
    private static int nextSeq = 1;
    private String customerId;
    private int loyaltyPoints;

    public Customer(String name, String phoneNumber) {
        super(name, phoneNumber);
        this.customerId = String.format("C%03d", nextSeq++);
        this.loyaltyPoints = 0;
    }

    public void addLoyaltyPoints(long purchaseAmount) {
        if (purchaseAmount > 1_000_000) {
            this.loyaltyPoints += 2;
        } else if (purchaseAmount > 500_000) {
            this.loyaltyPoints += 1;
        }
    }

    public double getDiscount() {
        if (this.loyaltyPoints > 5) {
            return 0.10;
        }
        if (this.loyaltyPoints > 3) {
            return 0.05;
        }
        return 0.0;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public String getInfo() {
        return "ID: " + customerId + ", Name: " + getName() + ", Phone: " + getPhoneNumber() + ", Loyalty Points: " + loyaltyPoints;
    }
}
