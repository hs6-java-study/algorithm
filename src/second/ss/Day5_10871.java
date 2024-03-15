package second.ss;

import java.util.Scanner;

public class Day5_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int standard = sc.nextInt();
        int[] intarr = new int[count];
        for(int i = 0; i < count; i++) {
            int num = sc.nextInt();
            intarr[i] = num;
        }
        for (Integer a: intarr) {
            if(a < standard) {
                System.out.println(a);
            }
        }
    }
}
