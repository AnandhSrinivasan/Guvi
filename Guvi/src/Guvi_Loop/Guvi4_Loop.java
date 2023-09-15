package Guvi_Loop;

import java.util.Scanner;

public class Guvi4_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("");
	     String ip = sc.nextLine();
	     StringBuilder reverse = new StringBuilder(ip).reverse();
	     System.out.println("" + reverse.toString());
	     sc.close();
	}
}
