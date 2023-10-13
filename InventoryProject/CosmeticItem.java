public class CosmeticItem extends Item{
    private String type;
    public CosmeticItem(int id, String name, int quantity, String type) {
        super(id, name, quantity);
        this.type =type;
    }

    public String getType() {
        return type;
    }
}
