package third.hw;

import java.util.Scanner;

public class Day3_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);
            System.out.println(first+""+last) ;
        }
    }
}
