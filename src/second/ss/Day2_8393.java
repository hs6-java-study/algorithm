package second.ss;

import java.util.Scanner;

public class Day2_8393 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 1; i<=num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
