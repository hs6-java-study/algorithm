package first.hw;
import java.util.Scanner;

public class Day4_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.nextLine());
        int B = Integer.parseInt(sc.nextLine());

        int one = A * (B % 10);
        int two = A * ((B % 100) / 10);
        int three = A * (B / 100) ;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(one + two*10 + three*100);
    }
}
