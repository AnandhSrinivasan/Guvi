package Guvi_Basics;

import java.util.Scanner;

public class GUVI2_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given 2 numbers N,M. Print 'yes' if their product is a perfect square else
		 * print 'no'. Sample Testcase : INPUT 5 5 OUTPUT yes
		 */
		
		 Scanner sc = new Scanner(System.in); 
		 int A = sc.nextInt(); 
		 int B=sc.nextInt(); 
		 int C= A * B ; 
		 double sqrt = Math.sqrt(C); 
		 if (sqrt * sqrt == C)
		 { System.out.println("Yes"); 
		    } else
		       { System.out.println("No");
		 }sc.close();
/* double A = Math.sqrt(25); System.out.println(A);*/
	}
}
