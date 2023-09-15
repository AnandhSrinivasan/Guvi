package Guvi_Loop;

import java.util.Scanner;

public class Guvi1_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
	}
}