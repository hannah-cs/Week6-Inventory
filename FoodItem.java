public class FoodItem extends Item{
    private int calories;


    public FoodItem(int id, String name, int quantity, int calories) {
        super(id, name, quantity);
        this.calories = calories;

    }

    public int getCalories() {
        return calories;
    }

}
