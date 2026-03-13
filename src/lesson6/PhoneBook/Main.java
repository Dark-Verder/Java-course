package lesson6.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "+7965111222");
        phoneBook.add("Ivanova", "+793814141");
        phoneBook.add("Petrov", "+960121212");
        phoneBook.add("Ivanova", "+499454545");

        System.out.println("Ivanova: " + phoneBook.get("Ivanova"));
        System.out.println("Petrov: " + phoneBook.get("Petrov"));
    }
}
