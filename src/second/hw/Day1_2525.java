package second.hw;

import java.util.Scanner;

public class Day1_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();
        h = (h +  (m + time) / 60) % 24;
        m = (m + time) % 60;
        System.out.println(h + " " + m);
    }
}
