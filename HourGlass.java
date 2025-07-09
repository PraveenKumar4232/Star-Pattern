package starPattern;

import java.util.Scanner;

public class HourGlass {

	public static void hourGlass(int n) {

		for (int i = n; i >= 1; i--) {
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int z = 1; z <= 2 * i - 1; z++) {
				if(z==1 || z == 2*i-1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 2; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int z = 1; z <= 2 * i - 1; z++) {
				if(z==1 || z==2*i-1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the width :");
		int n = scanner.nextInt();
		HourGlass.hourGlass(n);
	}

}
