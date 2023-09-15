package Guvi_AB;

import java.util.Scanner;

public class GUVI1_AB {
	/*
	 * Print the First 3 multiples of the given number "N". (N is a positive
	 * integer)
	 * 
	 * Note: print the characters with a single space between them.
	 * 
	 * Input Description: A positive integer is provided to you as an input.
	 * 
	 * Output Description: Print the First 3 multiples of the number with single
	 * spaces between them as an output.
	 * 
	 * Sample Input : 2 Sample Output : 2 4 6
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt();
		for (int i = 1; i <= 3; i++) {
            System.out.print(A * i);
            if (i < 3) {
                System.out.print(" ");
              }
        }
        sc.close();
    }
}