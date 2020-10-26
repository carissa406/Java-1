import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		String newstr = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				newstr += str.charAt(i);
				
			}
			
		}
		
		System.out.println(newstr);

	}

}
