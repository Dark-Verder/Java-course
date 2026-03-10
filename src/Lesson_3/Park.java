package Lesson_3;

public class Park {
    class Attractions {
        private String name;
        private String workingHours;
        private double price;

        public Attractions(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println(name + " ,"
                    + workingHours + ", "
                    + price + "$");
        }
    }
}