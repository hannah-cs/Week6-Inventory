
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Inventory items = new Inventory();

        Item item = new Item (001,"Example", 4);
        Item item2 = new Item (002,"Example Two", 0);

        items.add(item);
        items.add(item2);

        System.out.println(items.listItems());
    }
}