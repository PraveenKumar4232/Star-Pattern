package starPattern;

public class DimondShape {

	public static void main(String[] args) {
		// upper triangle
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int z = 1; z <= 2 * i - 1; z++) {
				if (z == 1 || z == 2 * i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		// lower triangle
		for (int i = 4; i >= 1; i--) {
			System.out.print(" ");
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");
			}
			for (int z = 1; z <= 2 * i - 1; z++) {
				if (z == 1 || z == 2 * i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
