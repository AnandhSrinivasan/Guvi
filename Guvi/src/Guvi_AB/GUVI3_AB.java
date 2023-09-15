package Guvi_AB;

import java.util.Scanner;

public class GUVI3_AB {
	/*
	 * You are given with a number "N", find its cube.
	 * 
	 * Input Description: A positive integer is provided.
	 * 
	 * Output Description: Find the cube of the number.
	 * 
	 * Sample Input : 2 Sample Output : 8
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt();
		int cube=A * A * A;
		System.out.println(cube);
		sc.close();
	}
}
