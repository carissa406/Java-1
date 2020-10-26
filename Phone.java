import java.util.Scanner;

public class Phone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String letter = input.nextLine();
		
		char upLetter = Character.toUpperCase(letter.charAt(0));
		
		if (upLetter == 'A' || upLetter == 'B' || upLetter == 'C') {
			System.out.println("The corresponding number is 2");
		}
		else if (upLetter == 'D' || upLetter == 'E' || upLetter == 'F') {
			System.out.println("The corresponding number is 3");
		}
		else if (upLetter == 'G' || upLetter == 'H' || upLetter == 'I') {
			System.out.println("The corresponding number is 4");
		}
		else if (upLetter == 'J' || upLetter == 'K' || upLetter == 'L') {
			System.out.println("The corresponding number is 5");
		}
		else if (upLetter == 'M' || upLetter == 'N' || upLetter == 'O') {
			System.out.println("The corresponding number is 6");
		}
		else if (upLetter == 'P' || upLetter == 'Q' || upLetter == 'R' || upLetter == 'S') {
			System.out.println("The corresponding number is 7");
		}
		else if (upLetter == 'T' || upLetter == 'U' || upLetter == 'V') {
			System.out.println("The corresponding number is 8");
		}
		else if (upLetter == 'W' || upLetter == 'X' || upLetter == 'Y' || upLetter == 'Z') {
			System.out.println("The corresponding number is 9");
		}
		else {
			System.out.println(upLetter + " is an invalid input");
		}
			
	}

}
