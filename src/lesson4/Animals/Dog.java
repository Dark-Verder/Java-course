package lesson4.Animals;

public class Dog extends Animal {

    protected static int dogCount;

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }
}

