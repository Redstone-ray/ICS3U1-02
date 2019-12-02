package userInput;

import java.io.DataInputStream;
import java.io.IOException;

public class CelsiusAndFar {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		double cel,fahr;
		DataInputStream input = new DataInputStream(System.in);
		
		System.out.print("Please enter the temprature in Celsius");
		cel=Double.parseDouble(input.readLine());
	
		fahr=1.8*cel+32;
				
		System.out.println(cel+"degrees celsius in fahrenheit is:"+fahr);

		
		


	}

}
