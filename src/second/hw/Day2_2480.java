package second.hw;

import java.util.Scanner;

public class Day2_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int money = 0;
        if (A == B && A == C ) {
            money = 10000 + A * 1000;
        } else if (A == B && A !=C || A == C && A != B){
            money = 1000 + A * 100;
        } else if (B == C && B != A){
            money = 1000 + B * 100;
        }else{
            int max = A ;
            if (max < B) max = B;
            if (max < C) max = C;
            money = max * 100;
        }
        System.out.println(money);
    }
}