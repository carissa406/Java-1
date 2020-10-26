import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password: ");
		String password = sc.nextLine();
		
		checkPassword(password);

	}

	public static void checkPassword (String password) {
		Boolean valid = true;
		
		if (password.length() >= 8) {
			int digits = 0;
			for (int i = 0; i < password.length(); i++) {
				if (Character.isDigit(password.charAt(i))) {
					digits++;
				}	
			}
			if (digits >= 2) {
				for (int i = 0; i < password.length(); i++) {
					if (Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i))) {
						continue;
					}
					else
						valid = false;
				}
			}
			else
				valid = false;
		}
		else
			valid = false;
		
		if (valid)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
}
