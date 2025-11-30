package restaurant;

public class Food extends MenuItem {
    private String spiceLevel;
    private int preparationTime;

    public Food(int itemId, String name, long price, String spiceLevel, int preparationTime) {
        super(itemId, name, price, "food");
        this.spiceLevel = spiceLevel;
        this.preparationTime = preparationTime;
    }

    public String getSpiceLevel() {
        return spiceLevel;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setSpiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    @Override
    public String getDetails() {
        return "ID: " + getItemId() + ", Name: " + getName() + ", Price: " + getPrice() + ", Category: food, Spice: " + spiceLevel + ", Preparation Time: " + preparationTime + "min";
    }
}
