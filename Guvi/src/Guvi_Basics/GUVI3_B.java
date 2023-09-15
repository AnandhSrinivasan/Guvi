package Guvi_Basics;

import java.util.Scanner;

public class GUVI3_B {

	/*
	 * Given 3 numbers N , L and R. Print 'yes' if N is between L and R else print
	 * 'no'. Sample Testcase : INPUT 3 2 6 OUTPUT yes
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int R = sc.nextInt();
		int L = sc.nextInt();
		if (N>=L == N<=R) {
			System.out.println("Yes");	
		} else {
			System.out.println("No");
		} sc.close();
	}
}
