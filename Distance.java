import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(
			"Enter x1 and y1: ");
		String point1 = input.nextLine();
		
		System.out.print(
			"Enter x2 and y2: ");
		String point2 = input.nextLine();
		
		String point1array[] = point1.split(" ");
		String point2array[] = point2.split(" ");
		
		double x1 = Double.parseDouble(point1array[0]);
		double y1 = Double.parseDouble(point1array[1]);
		double x2 = Double.parseDouble(point2array[0]);
		double y2 = Double.parseDouble(point2array[1]);
		
		double ans = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), .5);
		
		System.out.println("The distance between the two points is: " + ans);
		
		input.close();
	}

}
