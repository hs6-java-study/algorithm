package kr.or.kosa;

import java.util.Scanner;

public class Day4_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < count - i; j++) {
				System.out.print(" ");
			}
			for (int j = count; j > count - i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
