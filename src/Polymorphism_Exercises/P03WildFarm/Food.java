package Polymorphism_Exercises.P03WildFarm;

public abstract class Food {
    private int quantity;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    protected final int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
