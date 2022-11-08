package Polymorphism_Lab.P02Shapes;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2D, 4D);

        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        Shape circle = new Circle(13.4);

        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());
    }
}
