import java.util.Scanner;


public class ArrayTest {
	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("tong:"+sum);
	}
}
