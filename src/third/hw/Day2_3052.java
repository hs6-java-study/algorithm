package third.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day2_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[42];

        for (int i = 0; i < 10; i++){
            nums[(sc.nextInt() % 42)]++;
        }
        int count = 0;
        for (int num : nums){
            if(num != 0) count++;
        }
        System.out.println(count);
    }
}
