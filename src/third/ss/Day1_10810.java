package third.ss;

import java.util.Scanner;

public class Day1_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bag = sc.nextInt();
        int count = sc.nextInt();
        int [] rooms = new int[bag];
        for( int i = 0; i<count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int k = a-1; k < b; k++) {
                rooms[k] = c;
            }
        }
        for ( int j = 0; j<rooms.length; j++){
            System.out.print(rooms[j] + " ");
        }

    }
}
