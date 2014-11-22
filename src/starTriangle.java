import java.util.Scanner;

public class starTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		System.out.println("Enter an enteger: ");
		x = scanner.nextInt();

		leftTriangle(x);
	}

	public static void leftTriangle(int x) {
		int i;
		int j;
		for (i = 1; i <= x; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
