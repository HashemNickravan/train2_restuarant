package restaurant;

public class Beverage extends MenuItem {
    private String size;
    private String temperature;

    public Beverage(int itemId, String name, long price, String size, String temperature) {
        super(itemId, name, price, "Beverage");
        this.size = size;
        this.temperature = temperature;
    }

    public String getSize() {
        return size;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getDetails() {
        return "ID: " + getItemId() + ", Name: " + getName() + ", Price: " + getPrice() + ", Category: Beverage, Size: " + size + ", Temperature: " + temperature;
    }
}
