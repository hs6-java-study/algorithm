package third.hw;

import java.util.Scanner;

public class Day3_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String nums = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int)nums.charAt(i)-48;
        }
        System.out.println(sum);
    }
}