import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		int assign = a[0];
		for (int i = 0; i < a.length; i++) {
			if (assign < a[i]) {
				assign = a[i];
			}
		}
		System.out.println(assign);
	}
	
	public static void bubbleSort(int[] a) {
		// TODO Auto-generated method stub

	}
}
