package lesson5;

public class MyArrayDataException extends Exception {

    public MyArrayDataException (int i , int j) {
        super ("Wrong data in [" +i + "] [" + j + "]");
    }
}
