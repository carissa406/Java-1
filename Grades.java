import java.util.Arrays;
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numOfstu = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter "+numOfstu+" scores: ");
		String strScores = sc.nextLine();
		
		//turn strScores a string of scores into an array and split
		String[] arrScores = strScores.split(" ");
		
		//make new array for integers
		int[] intScores = new int[arrScores.length];
		
		//turn string array into integer array
		for (int i = 0; i < arrScores.length; i++) {
			intScores[i] = Integer.parseInt(arrScores[i]);
		}
		
		//make a copy of the integer array
		int[] intScorescopy = new int[arrScores.length];
		for (int i = 0; i < arrScores.length; i++) {
			intScorescopy[i] = intScores[i];
		}
		
		//sort the new integer array copy
		Arrays.sort(intScorescopy);
		
		//print grades
		for (int i = 0; i < intScores.length; i++) {
			if (intScores[i] >= intScorescopy[intScorescopy.length-1]-10) {
				System.out.println("Student "+i+" score is "+intScores[i]+" and grade is A");
			}
			else if (intScores[i] >= intScorescopy[intScorescopy.length-1]-20) {
				System.out.println("Student "+i+" score is "+intScores[i]+" and grade is B");
			}
			else if (intScores[i] >= intScorescopy[intScorescopy.length-1]-30) {
				System.out.println("Student "+i+" score is "+intScores[i]+" and grade is C");
			}
			else if (intScores[i] >= intScorescopy[intScorescopy.length-1]-40) {
				System.out.println("Student "+i+" score is "+intScores[i]+" and grade is D");
			}
			else {
				System.out.println("Student "+i+" score is "+intScores[i]+" and grade is F");
			}
		}
		
		
	}
}
