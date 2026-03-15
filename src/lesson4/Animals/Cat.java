package lesson4.Animals;

public class Cat extends Animal {

    public static int catCount;

    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        super(name, 200, 0);
        this.appetite = appetite;
        this.satiety = false;
        catCount++;
    }

    public void eat(Bowl bowl) {
        if (bowl.getFood() >= appetite) {
            bowl.decrease(appetite);
            satiety = true;
            System.out.println(name + " ate.");
        } else {
            satiety = false;
            System.out.println(name + " is still hungry.");
        }
    }
}
