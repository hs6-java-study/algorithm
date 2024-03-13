package second.ss;

import java.util.Scanner;

public class Day3_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int totalPrice = sc.nextInt();
        int totalType = sc.nextInt();
        for(int i=0; i <totalType; i++) {
            int money = sc.nextInt();
            int count = sc.nextInt();
            sum += money * count;
        }
        if(totalPrice == sum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
