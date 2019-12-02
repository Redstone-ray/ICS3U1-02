package unitone.test;

import java.io.DataInputStream;
import java.io.IOException;

public class ISpeakTxtmsg {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		String[] shortForm;
		String userInput;
		shortForm = new String[4];
		shortForm[1]= "Canadian Computing Competition";
		shortForm[2]="I'm happy";
		shortForm[3]="talk to you later";
		while (true) {
			System.out.print("Enter phrase>");
			userInput = input.readLine();
			if (userInput.equalsIgnoreCase("CCC")) {
				System.out.println(shortForm[1]);
			}
			else if (userInput.equalsIgnoreCase(":-)")) {
					System.out.println(shortForm[2]);
			}
			else if (userInput.equalsIgnoreCase("TTYL")) {
				System.out.println(shortForm[3]);
		    }
			else {
				System.out.println(userInput);
			}
		
		
	}

}
}
