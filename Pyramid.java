import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int lines = input.nextInt();
		
		for (int i = 1; i <= lines; i++) {
			
			for (int j = lines - i; j >= 1; j--) {
				System.out.print("  ");
			}	
			
			for (int k = i; k >= 2; k--) {
				System.out.print(k + " ");
			}
			
			for (int l = 1; l <= i; l++) {
				System.out.print(l + " ");
			}
			
			System.out.println();
		}

	}

}
