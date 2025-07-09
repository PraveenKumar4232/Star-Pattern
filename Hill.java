package starPattern;

public class Hill {

	public static void doubleHill() {
		for(int i=1; i<=5; i++) {
			for(int s=1; s<=5-i; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			
			for(int s=1; s<=5-i; s++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void leftDoubleHill() {
		for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for(int j=1; j<=5-i; j++) {
                System.out.print("  ");
            } 
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	
	public static void rightDoubleHill() {
		for(int i=1; i<=5; i++) {
            for(int sp=1; sp<=5-i; sp++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for(int sp=1; sp<=5-i; sp++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		Hill.doubleHill();
		System.out.println();
		Hill.leftDoubleHill();
		System.out.println();
		Hill.rightDoubleHill();
	}

}
