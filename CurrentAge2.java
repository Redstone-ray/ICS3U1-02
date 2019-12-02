package userInput;
/*
 The current age class
 Programmer: Richard Ding
 Date: September.12th.2019
 This program tests user input and output
*/

import java.io.*;
import java.util.Random;
public class CurrentAge2 {
/**
 * 
 * @param args 
 * The main method
 * @throws IOException
 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
	
		DataInputStream input = new DataInputStream(System.in);
		
		String myName;
		int myAge;
		while (true){
			Random rand = new Random();
			double n = rand.nextInt(999999) + 99999;
			System.out.println(n*n*n*n*n*n*n);
		}

		      		
	}//closing main method

}//Current age Class
