package InventoryProject;

public class FoodItem extends Item {

    private String expiryDate;
    public FoodItem(int id, String name, int quantity, String expiryDate) {
        super(id, name, quantity);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "FoodItem {" +
                "id: " + getId() +
                ", name: " + getName() +
                ", quantity: " + getQuantity() +
                ", expiry date: " + getExpiryDate() +
                "}";
    }
}