package Guvi_IP_OP;

import java.util.Scanner;

public class Guvi8_Ip_Op {
//		Write a code to get the input in the given format and print the output in the given format.
//
//Input Description:
//A single line contains three float values separated by space.
//
//Output Description:
//Print the float value separated by line.
//
//Sample Input :
//2.3 4.5 7.8
//Sample Output :
//2.3
//4.5
//7.8
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String[] B = A.split(" ");
		for (String values : B) {
		float output = Float.parseFloat(values);
		System.out.println(output);
    	}sc.close();
	}
}
