package Guvi_Basics;

import java.util.Scanner;

public class GUVI4_B {

	public static boolean isComposite(int N){
		if(N<=1) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				return true;
			}
		} return false;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (isComposite(num)) {
			System.out.println("Yes");
		} else {
            System.out.println("No");
		}sc.close();	
	}
}