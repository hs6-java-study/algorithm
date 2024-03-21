package third.ss;

import java.util.Scanner;

public class Day4_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for ( int i = 97; i< 123; i++) {
            System.out.print(a.indexOf(i) + " ");
        }
    }
}
