import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) throws InsufficientStockException {
        hasEnoughItems();
        items.remove(item);
    }
    public List<Item> listItems() {
       return items;
    }

    public Item search(Item item) throws ItemNotFoundException {
        int index = items.indexOf(item);
        if (index < 0) {
            throw new ItemNotFoundException("Item not found");
        }
        return items.get(index);
    }

    private boolean hasEnoughItems( ) throws InsufficientStockException {
        int quantity = items.size();
        if (quantity < 1) {
            throw new InsufficientStockException("Not enough items in stock.");
        }
        return true;
    }
}
