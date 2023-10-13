package InventoryProject;

public class ElectronicsItem extends Item {

    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ElectronicsItem(int id, String name, int quantity, int serialNumber) {
        super(id, name, quantity);
        this.serialNumber = serialNumber;
    }
    @Override
    public String toString() {
        return "ElectronicsItem {" +
                "id: " + getId() +
                ", name: " + getName() +
                ", quantity: " + getQuantity() +
                ", serial number: " + getSerialNumber() +
                "}";
    }
}