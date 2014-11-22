
import java.util.Scanner;

public class Search{
	public static void main(String[] args) {
		int[] a = new int[5];
		int x;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			x = scanner.nextInt();
		}
		bubbleSort(a);
	}
	
	public static void bubbleSort(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0;i < a.length; i++) {
			int assign = a[0];
			for (int j = i-1 ; j >= 0; j--) {
				if (a[j] > a[j + 1]) {
					assign = a[j + 1];
					a[j + 1] = a[j];
					a[j] = assign;
				}

			}
		}
//		System.out.println(a[i]);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}

	}
}
