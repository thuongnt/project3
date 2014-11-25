import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		int[] a = new int[10];
		int key;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}

		System.out.println("Enter key: ");
		key = scanner.nextInt();

		System.out.println("The array after sorting: ");
		bubbleSort(a);

		System.out.println("Found " + key + " at " + binarySearch(a, key));

	}

	public static void bubbleSort(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			int assign = a[0];
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] > a[j + 1]) {
					assign = a[j + 1];
					a[j + 1] = a[j];
					a[j] = assign;
				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static int binarySearch(int[] a, int key) {
		int min = 0;
		int max = a.length - 1;
		int p = -1;
		while (min <= max) {
			p = (max + min) / 2;
			if (a[p] > key)
				max = p - 1;
			else if (a[p] < key) 
				min = p + 1;
			else if(a[p] == key)
				return p;
			}
		return -1;
	}
}
