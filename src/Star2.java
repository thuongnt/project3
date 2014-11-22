
public class Star2 {
	public static void main(String[] args) {
		int i;
		int j;
		int space;
		for(i = 1; i <= 15; i++){
			for(space = 0; space <(15-i); space ++){
				System.out.print(" ");
			}
			for(j = 1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println("  ");
		}
	}

}