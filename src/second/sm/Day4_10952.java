package second.sm;

import java.util.Scanner;

public class Day4_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 && b == 0) {
                break;
            } else {
                System.out.println(a+b);
            }
        }
    }
}
