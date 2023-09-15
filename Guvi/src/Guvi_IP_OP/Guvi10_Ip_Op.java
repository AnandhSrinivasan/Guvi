package Guvi_IP_OP;

import java.util.Scanner;

public class Guvi10_Ip_Op {
	/*
	 * Write a code to get the input in the given format and print the output in the
	 * given format.
	 * 
	 * Input Description: A single line contains a string.
	 * 
	 * Output Description: Print the characters in a string separated by comma.
	 * 
	 * Sample Input : guvi Sample Output : g,u,v,i
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		for (int i = 0; i <= A.length()-1; i++) {
			if (i < A.length()-1) {
				System.out.print(A.charAt(i)+",");
			} else {
				System.out.print(A.charAt(i));
			}
		}sc.close();
	}
}
