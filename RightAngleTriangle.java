package starPattern;

public class RightAngleTriangle {

	public static void rightHalf() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void leftHalf() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int z = 1; z <= i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		RightAngleTriangle.rightHalf();
		System.out.println();
		RightAngleTriangle.leftHalf();
	}

}
