package third.ss;

import java.util.Scanner;

public class Day1_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bag = sc.nextInt();
        int count = sc.nextInt();
        int [] intarr = new int[bag+1];
        for(int i = 1; i<=bag; i++) {
            intarr[i] = i;
        }
        for(int i = 0; i<count; i++) {
            int cross = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            cross = intarr[a];
            intarr[a] = intarr[b];
            intarr[b] = cross;
        }
        for(int j = 1; j<=bag; j++){
            System.out.print(intarr[j] + " ");
        }

    }
}
