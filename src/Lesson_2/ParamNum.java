package Lesson_2;

public class ParamNum {
    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result = isNegative(-5);
        System.out.println(result);
    }
}



