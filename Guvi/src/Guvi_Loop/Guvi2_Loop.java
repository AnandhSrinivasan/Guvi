package Guvi_Loop;

import java.util.Scanner;

public class Guvi2_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int N : " );
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			System.out.println(i);
		}sc.close();
	}
}
