package InventoryProject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElectronicsItemTest {

    @Test
    public void testElectronicsItemConstructor() {
        ElectronicsItem electronicsItem = new ElectronicsItem(1, "Laptop", 10, 12345);
        assertEquals(1, electronicsItem.getId());
        assertEquals("Laptop", electronicsItem.getName());
        assertEquals(10, electronicsItem.getQuantity());
        assertEquals(12345, electronicsItem.getSerialNumber());
    }

    @Test
    public void testElectronicsItemToString() {
        ElectronicsItem electronicsItem = new ElectronicsItem(2, "Smartphone", 5, 67890);
        String expected = "ElectronicsItem {id: 2, name: Smartphone, quantity: 5, serial number: 67890}";
        assertEquals(expected, electronicsItem.toString());
    }

    @Test
    public void testElectronicsItemSetSerialNumber() {
        ElectronicsItem electronicsItem = new ElectronicsItem(3, "Tablet", 7, 54321);
        electronicsItem.setSerialNumber(98765);
        assertEquals(98765, electronicsItem.getSerialNumber());
    }
}