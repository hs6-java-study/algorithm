package third.ss;

import java.util.Scanner;

public class Day2_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = i+1;
        }

        for (int j = 0; j < b; j++) {
            int c = sc.nextInt()-1;
            int d = sc.nextInt()-1;
            while( c < d) {
                int temp = arr[c];
                arr[c] = arr[d];
                arr[d] = temp;
                c++;
                d--;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+ " ");
        }
    }
}
