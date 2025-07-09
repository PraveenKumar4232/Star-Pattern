package starPattern;

public class Triangle {

	public static void triangle() {
		// rows
		for (int i = 1; i <= 5; i++) {
			// space
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			// star
			for (int z = 1; z <= 2 * i - 1; z++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public static void reverseTriangle() {

		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (int z = 1; z <= 2 * i - 1; z++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public static void hallowTriangle() {

		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (int z = 1; z <= 2 * i - 1; z++) {
				if (i == 5 || z == 1 || z == 2 * i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		Triangle.triangle();
		System.out.println();
		Triangle.reverseTriangle();
		System.out.println();
		Triangle.hallowTriangle();
	}

}
