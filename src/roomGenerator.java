import java.util.Scanner;

public class roomGenerator {

	public static void main(String[] args) {
		String answer;

		// This program calculates the area and perimeter of up to 2 rectangular shaped
		// rooms.
		System.out.println("Welcome to the Room Detail Generator!");
		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("Enter Length: ");
			float length = scan.nextFloat(); // stores user input into the length integer variable.

			System.out.println("Enter Width: ");
			float width = scan.nextFloat(); // stores user input into the width integer variable.

			System.out.print("Area:");
			System.out.println(width * length); // formula for area based on the input user entered.

			System.out.print("Perimeter:");
			System.out.println(width * 2 + length * 2); // formula for perimeter based on the input entered.

			System.out.println("Continue?(y/n)");
			answer = scan.next();
		} while (answer.equalsIgnoreCase("y"));

		System.out.println("ADIOS");

	}
}
