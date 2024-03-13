package second.ss;

import java.util.Scanner;

public class Day3_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = (sc.nextInt() / 4);

        for(int i = 0; i < count; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
