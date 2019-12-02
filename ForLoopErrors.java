package unitone.test;
// The "ForLoopErrors" class.
import java.io.*;
public class ForLoopErrors
{
    public static void main (String[] args) throws IOException
    {
	DataInputStream input = new DataInputStream (System.in);
	//////////////////////////////////////////////////////////////////////
	// Display Help! 20 times

	for (int i = 1 ; i <= 20 ; i++)
	{
	    System.out.println ("Help!");
	}
	System.out.println ("");

	//////////////////////////////////////////////////////////////////////
	// Display the numbers 1 - 15 all on one line

	for (int i = 1 ; i <= 15 ; i++)
	{
	    System.out.print("x");
	}
	System.out.println ("");
	
	//////////////////////////////////////////////////////////////////////
	// Display the numbers 1-5, their squares, and their cubes in a table

	System.out.println ("Number/tSquare/tCube");
	for (int x = 1 ; x <= 5 ; x++)
	{
	    System.out.println (x + "\t" + x*x + "\t" + x*x*x);
	}
	System.out.println ("");
	
	//////////////////////////////////////////////////////////////////////
	// Ask the user to enter 5 marks which may include decimals
	// Display the total and average of the marks
	
	double mark=0, total = 0;
	for (int x = 1 ; x <= 5 ; x++)
	{
	    System.out.println ("Enter mark # " + x + " ");
	    mark = Integer.parseInt (input.readLine());
	    total = mark + total;
	}
	System.out.println ("The total of the marks is " + total);
	System.out.println ("The average of the marks is " + total / 10);

	System.out.println ("");
	
	////////////////////////////////////////////////////////////////////////
	// Count down from 25 to 1
	
	for (int x = 25 ; x >= 1 ; x--)
	{
	    System.out.println (x);
	}
	System.out.println ("");
	
	//////////////////////////////////////////////////////////////////////
	// Roll a "die" 50 times and display each; 
	// Count and display the number of times the '3' is rolled
	
	double dice, count = 0;
	for (int i = 1 ; i <=50 ; i++)
	{
	    dice = (int) (Math.random () * 6 + 1);
	    System.out.println(dice);
	    if (dice == 3)
	    {
		count++;
	    }
	}

	System.out.println ("The number 3 was rolled " + count + " times");

	System.out.println ("");
	
	//////////////////////////////////////////////////////////////////////

    } // main method
} // ForLoopExercises class
