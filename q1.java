import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter num 2 : ");
        num2 = sc.nextInt();
        System.out.println("Enter num 3 : ");
        num3 = sc.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is greater");
            } else {
                System.out.println(num2 + " is greater");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " is greater");
            } else {
                System.out.println(num3 + " is greater");
            }

        }
    }
}
