package InventoryProject;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws InsufficientStockException {
        Inventory<FoodItem> foodInventory = new Inventory<>();
        FoodItem food1 = new FoodItem(001, "Bread", 3, "12/10/2023");
        FoodItem food2 = new FoodItem(002, "Rice", 4, "01/01/2026");

        foodInventory.add(food1);
        foodInventory.add(food2);

        Inventory<ElectronicsItem> electronicsInventory = new Inventory<>();
        ElectronicsItem electronics1 = new ElectronicsItem(101, "MacBook", 8, 12345678);
        ElectronicsItem electronics2 = new ElectronicsItem(102, "Google Pixel 5", 4, 87654321);

        electronicsInventory.add(electronics1);
        electronicsInventory.add(electronics2);

        System.out.println("Food Inventory:");
        for (FoodItem foodItem : foodInventory.listItems()) {
            System.out.println(foodItem);
        }

        System.out.println("Electronics Inventory:");
        for (ElectronicsItem electronicsItem : electronicsInventory.listItems()) {
            System.out.println(electronicsItem);
        }

    }
}