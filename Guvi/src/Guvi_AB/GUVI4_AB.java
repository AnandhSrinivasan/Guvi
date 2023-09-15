package Guvi_AB;

public class GUVI4_AB {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(1));
	}	
   public static int factorial(int n){
		if (n==1) {
			return 1;
		} else {
            return n * factorial(n - 1);
		}
   }
}