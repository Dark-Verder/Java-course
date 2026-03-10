package Lesson_3;

public class Main {

    public static void main(String[] args) {

        // --- Product ---
        Product product1 = new Product(
                "Fridge",
                "01.01.2026",
                "Bosch",
                "China",
                1000,
                true
        );

        product1.printInfo();


        // --- Park ---
        Park park = new Park();

        Park.Attractions ferrisWheel =
                park.new Attractions("Ferris Wheel", "10 am - 10 pm", 5);

        Park.Attractions rollerCoaster =
                park.new Attractions("Roller Coaster", "12 pm - 10 pm", 7);

        Park.Attractions carousel =
                park.new Attractions("Carousel", "9 am - 8 pm", 3);

        Park.Attractions huntedHouse =
                park.new Attractions("Hunted House", "4 pm - 12 am", 8);

        Park.Attractions bumperCars =
                park.new Attractions("Bumper Cars", "10 am - 12 am", 9);

        ferrisWheel.printInfo();
        rollerCoaster.printInfo();
        carousel.printInfo();
        huntedHouse.printInfo();
        bumperCars.printInfo();
    }
}