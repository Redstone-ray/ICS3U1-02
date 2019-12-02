package ifStatement;

import java.io.DataInputStream;
import java.io.IOException;

public class TrueOrFalse {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		String answer;
		System.out.println("Egg existed before chicken T/F");
		answer=input.readLine();
		if (answer.equalsIgnoreCase("T"))
		{
			System.out.println("You are right!");
		}
		else if (answer.equalsIgnoreCase("F"))
		{
			System.out.println("Think again about it");
		}
		else
		{
			System.out.println("Your input charc is invaild ");
		}
		double a = 0;
		@SuppressWarnings("unused")
		int b= (int) a;

	}

}
