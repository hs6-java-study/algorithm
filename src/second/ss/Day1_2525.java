package second.ss;
import java.util.Scanner;

public class Day1_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int bc = b + c;
        int finalhour = (a + (bc / 60)) % 24;
        int finalminute = bc % 60;

        System.out.printf("%d %d", finalhour, finalminute);
    }
}
