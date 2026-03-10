package lesson4.shapes;

public class Main2 {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Белый");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Зеленый");

        Shape[] shapes = {circle, rectangle, triangle};

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println();
        }
    }
}