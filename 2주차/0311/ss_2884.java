package kr.or.kosa;

import java.util.Scanner;

public class ss_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (b >= 45) {
			System.out.printf("%d %d", a, b - 45);
		} else if (b < 45 && a > 0) {
			System.out.printf("%d %d", a - 1, b + 15);
		} else {
			System.out.printf("%d %d", a + 23, b + 15);
		}
	}
}
