import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
	}
	
	public static void displaySortedNumbers (double num1, double num2, double num3) {
		double arr[] = {num1, num2, num3};
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
