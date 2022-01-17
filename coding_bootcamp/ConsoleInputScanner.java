import java.util.Scanner;

public class ConsoleInputScanner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String line = in.nextLine();
		System.out.println("You entered a string: " + line);

		System.out.println("Enter an integer: ");
		int intLine = in.nextInt();
		System.out.println("You entered an int: " + intLine);

		System.out.println("Enter a float: ");
  		float floatLine = in.nextFloat();
		System.out.println("You entered a float: " + floatLine);

		in.close();
	}
}

