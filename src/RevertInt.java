import java.util.Scanner;


public class RevertInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		System.out.println(reverInt(a));
		scanner.close();
	}
	public static int reverInt(int a){
		int tmp = 0;
		while(a != 0){
			tmp= tmp*10 + a%10;
			a = a/10 ;
		}
		return tmp;
	}
}
