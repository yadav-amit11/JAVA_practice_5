import java.util.*;

public class q2 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        System.out.println("Enter 10 numbers in array ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else
                odd++;
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
