package lesson4.animals;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");

        Cat cat1 = new Cat("Мурзик", 15);
        Cat cat2 = new Cat("Барсик", 10);
        Cat cat3 = new Cat("Снежок", 20);

        dog1.run(150);
        dog1.swim(8);

        dog2.run(600);
        dog2.swim(12);

        cat1.run(100);
        cat1.swim(5);

        System.out.println();
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

        System.out.println("\n--- Кормление котов ---");

        Bowl bowl = new Bowl(30);
        bowl.info();

        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        System.out.println();
        bowl.info();

        System.out.println("\nСытость котов:");
        for (Cat cat : cats) {
            cat.info();
        }

        System.out.println("\nДобавим еду в миску:");
        bowl.addFood(20);
        bowl.info();
    }
}
