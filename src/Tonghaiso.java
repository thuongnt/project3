import java.util.Scanner;


public class Tonghaiso {
	public static void main(String[] aa){
		Scanner scanner= new Scanner(System.in);
		System.out.print("Hay nhap so a:");
		int a = scanner.nextInt();
		System.out.print("Hay nhap so b:");
		int b = scanner.nextInt();
		System.out.println("Tong 2 so " + a + " va " + b + " la " + tongHaiSo(a, b));
		scanner.close();
	}
	public static int tongHaiSo(int a, int b){
		int m;
		m=a+b;
		return m;
	}
}
