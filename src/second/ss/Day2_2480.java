package second.ss;
import java.util.Scanner;

public class Day2_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int price = 0;

        if (a == b && b == c) {
            price = 10000 + a * 1000;
        } else if (a == b || b == c || a == c) {
            if (a != b) {
                price = 1000 + c * 100;
            } else if (a != c) {
                price = 1000 + b * 100;
            } else {
                price = 1000 + a * 100;
            }
        } else {
            if (a >= b && a >= c) {
                price = a * 100;
            } else if (b >= a && b >= c) {
                price = b * 100;
            } else {
                price = c * 100;
            }
        }
        System.out.println(price);
    }
}
