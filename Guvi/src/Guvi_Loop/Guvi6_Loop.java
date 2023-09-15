package Guvi_Loop;

import java.util.Scanner;

public class Guvi6_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        int ip = sc.nextInt();
	        sc.close();
	        int sum = 0;
	        for (int i = 1; i <= ip; i++) {
	            sum += i;
	        }
	        System.out.println(sum);
 }
}
