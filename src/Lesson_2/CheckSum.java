package Lesson_2;
public class CheckSum {
    public static void checkSumSign() {
        int a = 15;
        int b = 15;
        if (a+b >= 0) {
            System.out.println ("The sum is positive");
        }
        else {
            System.out.println ("The sum is negative");
        }
    }
    public static void main (String[] args) {
        checkSumSign();
    }
}