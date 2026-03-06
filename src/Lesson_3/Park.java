package Lesson_3;

public class Park {
class Attractions {
    String name;
    String workingHours;
    double price;

    Attractions(String name, String workingHours, double price) {
        this.name = name;
        this.workingHours = workingHours;
        this.price = price;
    }
    void printInfo () {
        System.out.println(name + " ,"
                + workingHours + ", "
                + price + "$" );
    }
}
public static void main (String [] args) {
    Park park = new Park();
    Park.Attractions ferrisWheel = park.new Attractions("Ferris Wheel", " 10 am - 10 pm", 5.0);
    Park.Attractions rollerCoaster = park.new Attractions("Roller Coaster", " 12 pm - 10 pm", 7.5);
    Park.Attractions carousel = park.new Attractions("Carousel", " 9 am - 8 pm", 3);
    Park.Attractions huntedHouse = park.new Attractions("Hunted House", " 4 pm - 12 am", 8);
    Park.Attractions bumperCars = park.new Attractions("Bumper Cars", " 10 am - 12 am", 9);

    ferrisWheel.printInfo();
    rollerCoaster.printInfo();
    carousel.printInfo();
    huntedHouse.printInfo();
    bumperCars.printInfo();

    }
}