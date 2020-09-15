import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(
			"Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		double kilo = pounds * 0.454;
				
		System.out.println(pounds + " pounds is " + kilo + " kilograms");
		input.close();
	}

}
