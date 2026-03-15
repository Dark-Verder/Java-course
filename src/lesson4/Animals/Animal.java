package lesson4.Animals;

public class Animal {

    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public static int animalCount;

    public Animal(String name, int runLim, int swimLim) {
        this.name = name;
        this.runLimit = runLim;
        this.swimLimit = swimLim;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " ran " + distance + " m.");
        } else {
            System.out.println(name + " could not run " + distance + " m. ");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " swam " + distance + " m.");
        } else {
            System.out.println(name + " could not swim " + distance + " m.");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}