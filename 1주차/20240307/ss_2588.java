

import java.util.Scanner;

public class ss_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = b % 10;
		int d = (b - c) % 100 / 10;
		int e = (b - d - c) % 1000 / 100;
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(a*e);
		System.out.println(a*b);
		sc.close();
	}
}
