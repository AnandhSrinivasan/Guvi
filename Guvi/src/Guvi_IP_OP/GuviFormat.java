package Guvi_IP_OP;

import java.util.Scanner;

public class GuviFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the input (GUVI): ");
		        String input = scanner.nextLine();

		        // Check if the input is "GUVI"
		        if (input.equals("GUVI")) {
		            // Print the output in the desired format
		            for (int i = 0; i < input.length(); i++) {
		                System.out.print(input.charAt(i));
		                if (i < input.length() - 1) {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println(); // Move to the next line
		        } else {
		            System.out.println("Invalid input. Please enter 'GUVI'.");
		        }

		        scanner.close();
		    
	}

}
