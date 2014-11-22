import java.util.Scanner;

public class pascalTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row;
		System.out.println("Enter row:");
		row = scanner.nextInt();
		pascal(row);
	}

	public static void pascal(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(giaiThua(i) / (giaiThua(j) * giaiThua(i - j)));
			}
			System.out.println(" ");

		}

	}

	public static int giaiThua(int n) {

		if (n == 1 || n == 0) {
			return 1;
		} else {
			return n * giaiThua(n - 1);
		}
	}
}
