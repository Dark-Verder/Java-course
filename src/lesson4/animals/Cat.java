package lesson4.animals;

public class Cat extends Animal {
    private static int catCount = 0;

    private boolean satiety;
    private int appetite;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        this.satiety = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. Максимум: 200 м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl) {
        if (bowl.decreaseFood(appetite)) {
            satiety = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не поел, потому что в миске недостаточно еды.");
        }
    }

    public void info() {
        System.out.println("Кот " + name + ": сытость = " + satiety);
    }

    public static int getCatCount() {
        return catCount;
    }
}


