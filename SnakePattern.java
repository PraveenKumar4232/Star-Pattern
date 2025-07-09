package starPattern;
public class SnakePattern {

	public static void main(String[] args) {
		int counter = 1;
		int[][] arr = new int[5][5];

		for (int i = 0; i <= 4; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j <= 4; j++) {
					arr[i][j] = counter;
					counter++;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					arr[i][j] = counter;
					counter++;
				}
			}
		}
		// To print the final array
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
