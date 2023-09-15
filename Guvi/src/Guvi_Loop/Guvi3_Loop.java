package Guvi_Loop;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Guvi3_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        IntStream.rangeClosed(2, N).filter(num -> num % 2 == 0).forEach(System.out::println);
	        scanner.close();
	        System.out.println();
	}

}
