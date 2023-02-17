import java.util.*;

class Box {
    int length;
    int breadth;
    int height;

    int volume(int l, int b, int h) {
        return l * b * h;
    }
}

public class Demo {
    public static void main(String args[]) {
        Box b = new Box();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, breadth and height: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        b.volume(x, y, z);
        System.out.println(b.volume(x, y, z));

    }
}
