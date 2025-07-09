package starPattern;

public class PascalTriangle {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int sp = 1; sp <= 5 - i; sp++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num = num * (i - j) / j;
			}
			System.out.println();
		}
	}
}
