package third.hw;

import java.util.Scanner;

public class Day1_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Max = 0;
        int MaxIdx = 0;
        for (int i = 0; i < 9; i++){
            int num = sc.nextInt();
            if( Max < num) {
                Max = num;
                MaxIdx = i+1;
            }
        }
        System.out.println(Max + "\n" + MaxIdx);
    }
}
