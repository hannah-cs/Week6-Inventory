import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    public Item search(Item item) throws ItemNotFoundException {
        int index = items.indexOf(item);
        if (index < 0) {
            throw new ItemNotFoundException("Item not found");
        }
        return items.get(index);
    }

    public int enougthItems(Item item) throws InsufficientStockException {
        int itemNumber = items.size();
        if (itemNumber < 1) {
            throw new InsufficientStockException("Not enough items in stock.");
        }
        return itemNumber;
    }
}
