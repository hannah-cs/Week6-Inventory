package InventoryProject;

public class Main {
    public static void main(String[] args) throws InsufficientStockException {
        Inventory items = new Inventory();

        Item item = new Item (001,"Example", 4);
        Item item2 = new Item (002,"Example Two", 0);

        items.add(item);
        items.add(item2);
        items.remove(item2);
        items.remove(item);
        items.remove(item);


        System.out.println(items.listItems());
    }
}