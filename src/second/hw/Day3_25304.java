package second.hw;

import java.util.Scanner;

public class Day3_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        String result;
        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
        }
        result = (sum == x) ? "Yes" : "No";
        System.out.println(result);
    }
}
