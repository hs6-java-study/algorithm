package third.ss;

import java.util.Scanner;

public class Day2_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] scores = new int[a];
        int max = 0;
        double sum = 0;
        for (int i = 0; i<a; i++) {
            scores[i] = sc.nextInt();
            sum += scores[i];
            if(max < scores[i] ) {
                max = scores[i];
            }
        }
        System.out.println((double)sum/max/a*100);



        }

    }

