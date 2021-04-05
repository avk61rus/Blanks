package geekbrains.Lesson7;

public class Bowl {
    public int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void decrementFood(int amount) {
        this.foodAmount -= amount;
    }

    public int addFood(int addAmount) {
        foodAmount = foodAmount + addAmount;
        return addAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}

