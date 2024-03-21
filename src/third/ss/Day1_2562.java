package third.ss;

import java.util.Scanner;

public class Day1_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++ ) {
            int a = sc.nextInt();
            if( max < a) {
                max = a;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
