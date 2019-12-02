package userInput;
/*
The Student average mark system
Automatically calculates your average mark of any four given courses
*/
import java.io.*;


public class Student2 {

		@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		String firstName, lastName;
		double mark1,mark2,mark3,mark4,average;
		
		System.out.print("What is your first name? ");
		firstName=input.readLine();
		System.out.print("What is your last name? ");
		lastName=input.readLine();
		System.out.println("");
		//First Mark
		System.out.print("Please enter your first mark: ");
		mark1=Double.parseDouble(input.readLine());
		System.out.println("");
		//Second Mark
		System.out.print("Please enter your second mark: ");
		mark2=Double.parseDouble(input.readLine());
		System.out.println("");
		//Third Mark
		System.out.print("Please enter your third mark: ");
		mark3=Double.parseDouble(input.readLine());
		System.out.println("");
		//Fourth Mark
		System.out.print("Please enter your fourth mark: ");
		mark4=Double.parseDouble(input.readLine());
		System.out.println("");
		//Calculate Total
		average=(mark1+mark2+mark3+mark4)/4;
		System.out.println(firstName+" "+lastName);
		//Print Final Results
		System.out.println("The average of your 4 marks is "+average);
	}

}
