import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
		int n = 25000;
		int sao = 0;
		int trong = 0;
		for (int i = -n; i <= n; i++) {
			for(int j = -n ; j <= n; j++){
				if(i*i + j*j < n*n){
					//System.out.print("* ");
					sao++;
				}
				else{
					//System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(((float)(sao))/(n*n));
	}
}
