package userInput;
/*
 The current age class
 Programmer: Richard Ding
 Date: September.12th.2019
 This program tests user input and output
 */

import java.io.*;
public class CurrentAge {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		DataInputStream input = new DataInputStream(System.in);
		
		String myName, myAge;
		
		System.out.print("Please enter your name: ");
		myName = input.readLine();
		
		System.out.println("Hello "+myName+", how are you?");


		System.out.print("Please enter your age: ");
		myAge = input.readLine();
		
		System.out.println(myName+", you are 1E100 years old.");
		
		
	}//closing main method

}//Current age Class
