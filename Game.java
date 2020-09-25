import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		int computer = (int)(Math.random() * 3);
		
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int hand = input.nextInt();
		
		//if (hand == computer)
			//System.out.println("The computer is " + computer + ". You are " + hand + " too. It is a draw");
		if (hand == 0) {
			if (computer == 1)
				System.out.println("The computer is rock. You are scissor. You lose");
			else if (hand == computer)
				System.out.println("The computer is " + computer + ". You are " + hand + " too. It is a draw");
			else
				System.out.println("The computer is paper. You are scissor. You won");	
		}
		else if (hand == 1) {
			if (computer == 2)
				System.out.println("The computer is paper. You are rock. You lose");
			else if (hand == computer)
				System.out.println("The computer is " + computer + ". You are " + hand + " too. It is a draw");
			else
				System.out.println("The computer is scissor. You are rock. You won");	
		}
		else if (hand == 2) {
			if (computer == 0)
				System.out.println("The computer is scissor. You are paper. You lose");
			else if (hand == computer)
				System.out.println("The computer is " + computer + ". You are " + hand + " too. It is a draw");
			else
				System.out.println("The computer is rock. You are paper. You won");	
		}
	}

}
