package InventoryProject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FoodItemTest {

    @Test
    public void testFoodItemConstructor() {
        FoodItem foodItem = new FoodItem(1, "Milk", 5, "2023-10-31");
        assertEquals(1, foodItem.getId());
        assertEquals("Milk", foodItem.getName());
        assertEquals(5, foodItem.getQuantity());
        assertEquals("2023-10-31", foodItem.getExpiryDate());
    }

    @Test
    public void testFoodItemSetExpiryDate() {
        FoodItem foodItem = new FoodItem(2, "Bread", 3, "2023-11-15");
        foodItem.setExpiryDate("2023-12-10");
        assertEquals("2023-12-10", foodItem.getExpiryDate());
    }

    @Test
    public void testFoodItemToString() {
        FoodItem foodItem = new FoodItem(3, "Apples", 10, "2023-11-05");
        String expected = "FoodItem {id: 3, name: Apples, quantity: 10, expiry date: 2023-11-05}";
        assertEquals(expected, foodItem.toString());
    }
}