
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) throws InsufficientStockException {
        Inventory items = new Inventory();

        Item item = new Item (001,"Example", 4);
        Item item2 = new Item (002,"Example Two", 0);





        System.out.println(items.listItems());
        Inventory<CosmeticItem>  cosmeticItemInventory = new Inventory<>();
        Inventory<FoodItem>  foodItemInventory = new Inventory<>();
        cosmeticItemInventory.add(new CosmeticItem(1, "cream", 3, "skincare"));
        foodItemInventory.add(new FoodItem(1, "apple", 1, 10));
        System.out.println(cosmeticItemInventory.listItems().get(0).getType());
    }
}