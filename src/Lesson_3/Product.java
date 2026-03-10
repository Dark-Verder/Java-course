package Lesson_3;

public class Product {
    private String productName;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private int price;
    private boolean reserved;

    public Product(String productName,
                   String productionDate,
                   String manufacturer,
                   String countryOfOrigin,
                   int price,
                   boolean reserved) {

        this.productName = productName;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.reserved = reserved;
    }

    public void printInfo() {
        System.out.println(
                "Product name: " + productName + "\n" +
                        "Production date: " + productionDate + "\n" +
                        "Manufacturer: " + manufacturer + "\n" +
                        "Country of origin: " + countryOfOrigin + "\n" +
                        "Price: " + price + "$\n" +
                        "Reserved: " + reserved
        );
    }
}