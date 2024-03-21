package third.ss;

import java.util.Scanner;

public class Day3_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            String a = sc.nextLine();
            System.out.print(a.charAt(0));
            System.out.print(a.charAt(a.length()-1) + "\n");
        }

    }
}
