package lesson4.shapes;

public interface Shape {
    double getArea();

    double[] getSides();

    String getFillColor();

    String getBorderColor();

    default double getPerimeter() {
        double sum = 0;
        for (double side : getSides()) {
            sum += side;
        }
        return sum;
    }

    default void printInfo() {
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границ: " + getBorderColor());
    }
}