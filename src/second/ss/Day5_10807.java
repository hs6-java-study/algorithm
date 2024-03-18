package second.ss;

import java.util.Scanner;

public class Day5_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] nums = new int[input];
        for (int i = 0; i < input; i++) {
            int a = sc.nextInt();
            nums[i] = a;
        }
        int findNum = sc.nextInt();
        int count = 0;
        for (Integer a: nums) {
            if(a == findNum) count++;
        }
        System.out.println(count);
    }
}
