package lesson4.Animals;

public class Cat extends Animal {

    public static int catCount;

    private boolean satiety;

    public Cat(String name) {
        super(name, 200, 0);
        this.satiety = false;
        catCount++;
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.getFood() >= foodAmount) {
            satiety = true;
            System.out.println(name + " ate.");
        } else {
            satiety = false;
            System.out.println(name + " is still hungry.");
        }
    }
}
