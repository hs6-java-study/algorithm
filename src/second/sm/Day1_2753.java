package second.sm;

import java.util.Scanner;

public class Day1_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int result = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0) ? 1 : 0;
        System.out.println(result);
    }
}
