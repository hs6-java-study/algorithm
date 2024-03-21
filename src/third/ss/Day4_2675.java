package third.ss;

import java.util.Scanner;

public class Day4_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i<a; i++) {
            int b = sc.nextInt();
            String c = sc.next();
            for(int k = 0; k<c.length(); k++) {
                    for(int j = 0; j<b; j++) {
                    System.out.print(c.charAt(k));
                }

            }
            System.out.println();
        }
    }
}
