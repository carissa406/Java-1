import java.util.Scanner;

public class Cost {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");
		int weight = input.nextInt();
		double price = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		int weight2 = input.nextInt();
		double price2 = input.nextDouble();
		
		double cost1 = price / weight;
		double cost2 = price2 / weight2;
		
		if (cost1 < cost2)
			System.out.println("Package 1 has a better price.");
		else if (cost1 == cost2)
			System.out.println("Two packages have the same price.");
		else
			System.out.println("Package 2 has a better price.");

	}

}
