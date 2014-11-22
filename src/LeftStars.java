
public class LeftStars {

	public static void main(String[] args) {
		int i;
		int j;
		int space;
		for(i = 1; i <= 10; i++){
			for(space=10-i; space>=1; space--){
				System.out.print(" ");
			}
			for(j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	

	}
}
