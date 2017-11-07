import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello ASE2017 - How are you now? :)");
		System.out.println("Please enter your name:");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String name = br.readLine();
			HelloUser user = new HelloUser(name);
			user.greetUser();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
