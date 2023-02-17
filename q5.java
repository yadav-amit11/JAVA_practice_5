import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
}

class Calculate {
    private Rectangle rectangle;

    public Calculate(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public double area() {
        return rectangle.getLength() * rectangle.getBreadth();
    }

    public double perimeter() {
        return 2 * (rectangle.getLength() + rectangle.getBreadth());
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        Calculate calculate = new Calculate(rectangle);
        System.out.println("Area of rectangle: " + calculate.area());
        System.out.println("Perimeter of rectangle: " + calculate.perimeter());
    }
}