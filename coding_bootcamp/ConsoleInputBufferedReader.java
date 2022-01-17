import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleInputBufferedReader {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter some text: "); 
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
		String line = reader.readLine();
		System.out.println("Texted read from console: " + line);
	}
}

