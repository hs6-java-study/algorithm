package third.hw;

import java.util.Scanner;

public class Day4_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String reA = "" ;
        String reB = "";

        for (int i = 2; i >= 0; i--) {
            reA += A.charAt(i);
            reB += B.charAt(i);
        }
        int numA = Integer.parseInt(reA);
        int numB = Integer.parseInt(reB);
        System.out.println(numA > numB ? numA: numB);
    }
}
