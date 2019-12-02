package userInput;
/*
 The Bank Interest Program
 Automatically calculates amount of bank interests you earn
 */
import java.io.*;

public class BankInterest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		String name;
		double bankBalance, intRate, endingBal, totalInt;
		
		System.out.print("Please enter your name: ");
		name=input.readLine();
		System.out.print("Hello " + name);
		System.out.print("Please enter your opening bank balance: $");
		bankBalance=Double.parseDouble(input.readLine());
		System.out.print("Please enter your rate of interest(ie.4.5) ");
		intRate=Double.parseDouble(input.readLine());
		totalInt=bankBalance*intRate/100;
		endingBal=bankBalance+totalInt;
		System.out.println("The interest on your account is $"+totalInt);
		System.out.println("");
		System.out.println("Your ending balance is "+endingBal);

	}

}
