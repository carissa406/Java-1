import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter list: ");
		String nums = sc.nextLine();
		
		String[] arrOfstr = nums.split(" ");
		int[] arrOfint = new int[arrOfstr.length];
		int[] arrOfintcopy = new int[arrOfint.length];
		
		for (int i = 0; i < arrOfstr.length; i++) {
			arrOfint[i] = Integer.parseInt(arrOfstr[i]);
		}
		for (int i = 0; i < arrOfstr.length; i++) {
			arrOfintcopy[i] = arrOfint[i];
		}
		
		Arrays.sort(arrOfintcopy);
		
		int x = 0;
		for (int i = 0; i < arrOfstr.length; i++) {
			if (arrOfintcopy[i] == arrOfint[i]) {
				x++;
			}
		}
		
		if (x == arrOfintcopy.length) {
			System.out.print("The list is already sorted");
		}
		else {
			System.out.print("The list is not sorted");
		}
	}
}
