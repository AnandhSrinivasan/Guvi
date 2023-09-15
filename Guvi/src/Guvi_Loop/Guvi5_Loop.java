package Guvi_Loop;

import java.util.Scanner;

public class Guvi5_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int ip = sc.nextInt();
	sc.close();
	String value = Integer.toString(ip);
	for (int i = 0; i < value.length(); i++) {
		System.out.print(value.charAt(i));
		if (i<value.length()-1) {
			System.out.print(" ");
		}
	}
	System.out.println();
 }
}
