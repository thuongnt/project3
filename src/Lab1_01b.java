import java.util.Scanner;

public class Lab1_01b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int number3;

		System.out.print("Enter first integer: ");
		number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		System.out.print("Enter 3rd integer: ");
		number3 = input.nextInt();
		
		System.out.println(sum(number1,number2));
		System.out.println(product(number1,number2));
		System.out.println(difference(number1,number2));
		System.out.println(quotient(number1,number2));
		System.out.println(smallest(number1,number2,number3));
		System.out.println(largest(number1,number2,number3));

	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int difference(int a, int b) {
		return a - b;
	}

	public static int product(int a, int b) {
		return b * a;
	}

	public static int quotient(int a, int b) {
		if (b == 0) {
			System.out.println("Gia tri khong hop ly!!!");
			return 0;
		} else
			return a / b;
	}

	public static int smallest(int a, int b, int c) {
//		if (a > b) {
//			a = b;
//		}
//		if (a > c)
//			return c;
//		return a;
//		a = a < b ? a : b;
		return (a>b?b:a) < c ? (a>b?b:a) : c;
	}
	
	public static int largest(int a, int b, int c) {
		a = a > b ? a : b;
		return a > c ? a : c;
	}
	
}
