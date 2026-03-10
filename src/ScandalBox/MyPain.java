package ScandalBox;

public class MyPain {
    public static boolean checkNum(int a) {
        if (a > 10) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
            System.out.println(checkNum(15)) ;
}
}