

public class Giaithua {

	public static void main(String[] args) {
		System.out.println(giaiThua(8));					
	}
	
	public static int giaiThua(int n){
	if(n == 1){
		return n;
	}
	else{
		return n*giaiThua(n-1);
	}
		
	}
}
