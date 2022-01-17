public class ConsoleInputConsoleClass {
	public static void main(String[] args) {
		System.out.println("Enter some text:");
		String line = System.console().readLine();
		System.out.println("You entered a string: " + line);
	}
} 

