package third.ss;

import java.util.Scanner;

public class Day3_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String str = sc.next();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += str.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
