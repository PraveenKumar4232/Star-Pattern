package starPattern;
import java.util.Scanner;

public class Arrow {

	public static void downArrow(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2; j++) {
				if (j <= i || j > n * 2 - i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void upArrow(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n * 2; j++) {
				if (j <= i || j > n * 2 - i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void butterFly(int n) {
		// down arrow
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2; j++) {
				if (j <= i || j > n * 2 - i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		// up arrow
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n * 2; j++) {
				if (j <= i || j > n * 2 - i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void rombus(int n) {
		// up arrow
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n * 2; j++) {
				if (j <= i || j > n * 2 - i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		// down arrow
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2; j++) {
				if (j <= i || j > n * 2 - i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter the number of rows : ");
			int n = scanner.nextInt();
			System.out.print("Enter the option : ");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				Arrow.upArrow(n);
				break;
			case 2:
				Arrow.downArrow(n);
				break;
			case 3:
				Arrow.butterFly(n);
				break;
			case 4:
				Arrow.rombus(n);
				break;
			default:
				System.out.println("Default Method");
				break;
			}
		}
	}
}
