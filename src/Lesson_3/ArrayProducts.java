package Lesson_3;


import java.util.Arrays;
public class ArrayProducts {
    public static void main(String[] args) {
        Product[] appliances = new Product[5];
        appliances[0] = new Product("Microwave", "01.01.2026", "Bosch", "China", 450, true);
        appliances[1] = new Product("Refrigerator", "01.02.2026", "Walton", "Bangladesh", 500, false);
        appliances[2] = new Product("Hand Mixer", "02.02.2026", "Smeg", "Italy", 350, true);
        appliances[3] = new Product("Blender", "03.01.2026", "Breville", "Australia", 250, true);
        appliances[4] = new Product("Digital Scales", "04.02.2026", "Tescoma", "Czech Republic", 45, false);

        System.out.println(Arrays.toString(appliances));
    }

    static class Product {
        String productName;
        String productDate;
        String manufacturer;
        String countryOfOrigin;
        int price;
        boolean available;

        public Product(String productName,
                       String productDate,
                       String manufacturer,
                       String countryOfOrigin,
                       int price,
                       boolean available) {

            this.productName = productName;
            this.productDate = productDate;
            this.manufacturer = manufacturer;
            this.countryOfOrigin = countryOfOrigin;
            this.price = price;
            this.available = available;
        }

        @Override
        public String toString() {
            return productName + ", "
                    + productDate + ", "
                    + manufacturer + ", "
                    + countryOfOrigin + ","
                    + price + ", "
                    + available;
        }
    }
}












