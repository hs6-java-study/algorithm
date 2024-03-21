package third.ss;

import java.io.IOException;
import java.util.Scanner;

public class Day4_1152 {
    public static void main(String[] args) throws IOException {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        if(s.isEmpty()==false) {
            String[] Num = s.split(" ");
            System.out.println(Num.length);
        }
        else System.out.println(0);
    }
}