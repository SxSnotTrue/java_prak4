public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        circle.setRadius(10.0);
        System.out.println("New Radius: " + circle.getRadius());
        System.out.println("New Area: " + circle.getArea());
        System.out.println("New Circumference: " + circle.getCircumference());
    }
}