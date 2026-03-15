package lesson4.Animals;

public class Main {

    public static void main(String[] args) {

        Bowl bowl = new Bowl(50);

        Cat cat1 = new Cat("Fenix", 40);
        Cat cat2 = new Cat("Boss", 20);

        Dog dog1 = new Dog("Loor");
        Dog dog2 = new Dog("Bucks");

        Cat[] cats = {cat1, cat2};
        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        System.out.println("Food left in bowl: " + bowl.getFood());

        bowl.addFood(30);
        System.out.println("Added food to bowl.");

        cat2.eat(bowl);

        System.out.println("Food in bowl now: " + bowl.getFood());

        dog1.run(400);
        dog1.swim(5);

        cat1.run(150);
        cat1.swim(5);

        System.out.println("Quantity of animals is " + Animal.animalCount);
        System.out.println("Quantity of cats is " + Cat.catCount);
        System.out.println("Quantity of dogs is " + Dog.dogCount);
    }
}
