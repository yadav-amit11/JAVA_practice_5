import java.util.Scanner;

public class q3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for circle");
        System.out.println("Enter 2 for triangle");
        System.out.println("Enter 3 for square");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter radius of circle: ");
                double radius = input.nextDouble();
                double circleArea = 3.14 * radius * radius;
                System.out.println("area of circle : " + circleArea);
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = input.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = input.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("The area of the triangle is: " + triangleArea);
                break;
            case 3:
                System.out.print("Enter side length of the square: ");
                double side = input.nextDouble();
                double squareArea = side * side;
                System.out.println("The area of the square is: " + squareArea);
                break;

        }
    }
}