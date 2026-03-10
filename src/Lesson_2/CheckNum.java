package Lesson_2;

public class CheckNum {
    public static void CheckNum(int a) {
        if (a >= 0) {
            System.out.println("The num is positive");
        }
        else {
            System.out.println("The num is negative");
        }
    }
        public static void main (String[] args)  {
            CheckNum(5);
            CheckNum(-5);
            CheckNum(0);
        }
    }

