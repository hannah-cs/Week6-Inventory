package InventoryProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    private Inventory inventory;

    @BeforeEach
    void setUp() {
        inventory = new Inventory();
    }

    @AfterEach
    void tearDown() {
        inventory = null;
    }

    @Test
    void add() {
        FoodItem foodItem = new FoodItem(1, "apple", 10, "2022");
        inventory.add(foodItem);
        assertEquals(1, inventory.listItems().size());
    }


    @Test
    void removeShouldThrowException()  {
        Item item = new Item(1, "something", 3);
        InsufficientStockException thrown = assertThrows(InsufficientStockException.class, () -> {
            inventory.remove(item);

        });
        assertEquals("Not enough items in stock.", thrown.getMessage());
    }

    @Test
    void listItemsShouldShowItemsList() {
        Item item = new Item(2, "phone", 2);
        inventory.add(item);
       int size = inventory.listItems().size();
       assertEquals(1, size);
    }

    @Test
    void searchItemAfterId() throws ItemNotFoundException{
        Item item = new Item(1, "pen", 1);
        inventory.add(item);
        Item id = inventory.search(item);
        assertEquals(1, id.getId());

    }
}