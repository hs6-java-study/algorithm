package third.ss;

import java.util.Scanner;

public class Day1_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] intarr = new int[31];
        for(int i = 1; i<29; i++) {
            int num = sc.nextInt();
            intarr[num-1] = 1;
        }
        for(int j = 1; j<intarr.length; j++) {
            if(intarr[j] == 0){
                System.out.println(j);
            }
        }
    }
}
