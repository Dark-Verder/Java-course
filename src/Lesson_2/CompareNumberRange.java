package Lesson_2;

public class CompareNumberRange {
    public static boolean checkSum (int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <=20;
    }
    public static void main (String [] args) {
        boolean result = checkSum (7 , 8);
        System.out.println(result);
    }
}
