package lesson4.Animals;

public class Bowl {

    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void decrease(int value) {
        if (value <= food) {
            food -= value;
        }
    }

    public void addFood(int value) {
        food += value;
    }

    public int getFood() {
        return food;
    }
}
