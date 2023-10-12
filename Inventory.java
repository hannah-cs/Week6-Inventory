import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Item>  {
    List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public void remove(T item) throws InsufficientStockException {
        hasEnoughItems();
        items.remove(item);
    }
    public List<T> listItems() {
       return items;
    }

    public T search(T item) throws ItemNotFoundException {
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
