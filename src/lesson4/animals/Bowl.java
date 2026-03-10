package lesson4.animals;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("В миску добавили " + amount + " еды.");
        }
    }

    public void info() {
        System.out.println("В миске: " + food + " еды.");
    }
}
