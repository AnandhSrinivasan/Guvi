package Guvi_IP_OP;

import java.util.Scanner;

public class Guvi9_Ip_Op {
	/*
	 * Write a code to get the input in the given format and print the output in the
	 * given format.
	 * 
	 * Input Description: A single line contains a string.
	 * 
	 * Output Description: Print the characters in a string separated by line.
	 * 
	 * Sample Input : guvigeek Sample Output : g u v i g e e k
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		for (int i = 0; i <= A.length()-1; i++) {
			if (i <= A.length()-1) {
				System.out.println(A.charAt(i));
			} else {
				System.out.println(A.charAt(i));
			}
		}sc.close();
	}

}
