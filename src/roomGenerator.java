import java.util.Scanner;

public class roomGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This program calculates the area and perimeter of up to 2 rectangular shaped rooms.
		System.out.println("Welcome to the Room Detail Generator!");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Length: ");
		float length = scan.nextFloat(); //stores user input into the length integer variable.

		System.out.println("Enter Width: ");
		float width = scan.nextFloat();  //stores user input into the width integer variable.

		System.out.print("Area:");
		System.out.println(width * length); //formula for area based on the input user entered.

		System.out.print("Perimeter:");
		System.out.println(width + width + length + length); //formula for perimeter based on the input entered.

		System.out.println("Continue?(y/n)");     
		String answer = scan.next();                     
										//runs the code a second time storing new inputs if the user chooses to.
		{        									
			System.out.println("Enter Length: ");
			float length2 = scan.nextFloat();

			System.out.println("Enter Width: ");
			float width2 = scan.nextFloat();

			System.out.print("Area:");
			System.out.println(width2 * length2);   

			System.out.print("Perimeter:");
			System.out.println(width2 + width2 + length2 + length2);
		}
		while (answer.contains("y"));
			
		{	
			System.out.println("Room Calculations Complete!");
		}
		while (answer.contains("n"));
	}

}
