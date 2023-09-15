package Guvi_Basics;

/*import java.util.Arrays;*/
import java.util.Scanner;

public class GUVI1_B {
	/*
	 * Find the minimum among 10 numbers. Sample Testcase : INPUT 5 4 3 2 1 7 6 10 8
	 * 9 OUTPUT 1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] nums = {5, 4, 3, 2, 1, 7, 6, 10, 8, 9}; //int output =
		 * Arrays.stream(nums).min().orElse(Integer.MAX_VALUE); int output =
		 * Arrays.stream(nums).min().getAsInt(); System.out.println(output);
		 */
		/*
		 * int[] numbers = {5, 4, 3, 2, 1, 7, 6, 10, 8, 9}; int min = numbers[0]; for
		 * (int i = 1; i < numbers.length; i++) { if (numbers[i] < min) { min =
		 * numbers[i]; } } System.out.println(min);
		 */    
		/*
*/
		/*
		 * Find the minimum among 10 numbers. Sample Testcase : INPUT 5 4 3 2 1 7 6 10 8
		 * 9 OUTPUT 1
		 */
		  Scanner scanner = new Scanner(System.in);
		  String a=scanner.nextLine();
		  String b[]=a.split(" ");
		  int[] numbers = new int[b.length];
		  for(int i=0;i<numbers.length;i++){
		  numbers[i]=Integer.parseInt(b[i]);
		  }scanner.close();
		  int min = findMinimum(numbers);
		  System.out.println( min);
		  }
		  static int findMinimum(int[] arr) {
		  int min = arr[0];
		  for (int i = 1; i < arr.length; i++) {
		  if (arr[i] < min) {
		  min = arr[i];}
		 }
		  return min;
	}
}