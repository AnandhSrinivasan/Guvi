package Guvi_AB;

import java.util.Scanner;

public class GUVI2_AB {
	/*
	 * You are given Two Numbers, A and B. If C = A + B. Find C.
	 * 
	 * Note: Round off the output to a single decimal place.
	 * 
	 * Input Description: You are provided with two numbers A and B.
	 * 
	 * Output Description: Find the sum of the two numbers (A + B)
	 * 
	 * Sample Input : 1 1 Sample Output : 2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        double A = scanner.nextDouble();
	        double B = scanner.nextDouble();
	        
	        double C = A + B;
	        System.out.printf("%.2f", C);
	        scanner.close();
	//	Scanner sc = new Scanner(System.in);
		//int A = sc.nextInt();
	//	int B = sc.nextInt();
	//	int C = A+B;
	//	A=1;
	//	B=2;
	///	System.out.println("The Output is =" +C);
	//	sc.close();
	}
}
