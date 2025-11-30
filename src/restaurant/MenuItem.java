package restaurant;

public abstract class MenuItem {
    private int itemId;
    private String name;
    private long price;
    private String category;

    public MenuItem(int itemId, String name, long price, String category) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public abstract String getDetails();

    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
