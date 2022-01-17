public class CmdLineArgs {
	public static void main(String[] args) {
		// verify if the length of argos is greater than 0
		if (args.length <= 0) {
		System.out.println("No arguments provided");
		}

		// iterate over and print the argos
		for (String s : args) {
		System.out.println(s);
		}
	}
}

