package third.ss;

import java.util.Scanner;

public class Day2_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] rest = new int[42];
        int count = 0;
        for (int i = 0; i<10; i++) {
            int a = sc.nextInt();
            rest[a%42] = 1;
        }
        for(int j = 0; j<42; j++){
            if(rest[j] == 1) {
                ++count;
            }
        }
        System.out.println(count);
    }
}
