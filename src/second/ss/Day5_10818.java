package second.ss;

import java.util.Scanner;

public class Day5_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] intarr = new int[count];
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            intarr[i] = num;
        }
        int min = intarr[0];
        int max = intarr[0];
        for (int j = 0; j < count; j++) {
            if (min > intarr[j]) {
                min = intarr[j];
            }
            if (max < intarr[j]) {
                max = intarr[j];
            }

        }
        System.out.println(min + " " + max);
    }
}
