/*Programmer:Richard Ding
 * Last Modified Date: 2019-10-15
 * The Triva Program.
 */
package ifStatement.review;

import java.io.DataInputStream;
import java.io.IOException;

public class Triva {
	// declare variable types
	static String q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	@SuppressWarnings("deprecation")
	/**
	 * Use main method
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		// int questionNumber = 1;
		// declare score keeping variables
		int wrong = 0;
		int correctQuestion = 0;
		int invaild = 0;
		// declare the total percentage of correct questions
		double percent;

		// introduction
		System.out.println("Welcome to Central Triva, the topic is Computer");
		System.out.println("");
		System.out.println("Sooooooo, lets start!");
		System.out.println("");
		// question one
		// ask the question
		System.out.println("Question one:What is the binary form of Decimal:100");
		// give the answers, each on a new line
		System.out.println("a)1100100\nb)1100101\nc)1110110\nd)1000100\n");
		// ask for input
		System.out.print("Please input your answer:");
		// read the input
		q1 = input.readLine();
		// add a space
		System.out.println("");
		// sysout if the answer is correct
		if (q1.equalsIgnoreCase("a")) {
			System.out.println("The answer to the question is correct. Well done with grade ten binary");
			// add one to correct Question
			correctQuestion++;
			// sysout if the answer is incorrect
		} else if (q1.equalsIgnoreCase("b") || q1.equalsIgnoreCase("c") || q1.equalsIgnoreCase("d")) {
			System.out.println("The answer to the question is wrong");
			// add one to wrong
			wrong++;
		} else {
			// sysout if the answer is invaild
			System.out.println("That is an invaild input, please use either a,b,c or d");
		}
		System.out.println("");
		// question two
		System.out.println("Question two:What is GPU");
		System.out.println(
				"a)The Computer's \"brain\"\nb)The grapic processing unit\nc)The \"powerhouse\" \nd)Where the programs run");
		System.out.print("Please input your answer:");
		q2 = input.readLine();
		System.out.println("");
		if (q2.equalsIgnoreCase("b")) {
			System.out.println("The answer to the question is correct. You must have a good gaming experenice!");
			correctQuestion++;
		} else if (q2.equalsIgnoreCase("a") || q2.equalsIgnoreCase("c") || q2.equalsIgnoreCase("d")) {
			System.out.println("The answer to the question is wrong");
			wrong++;
		} else {
			System.out.println("That is an invaild input, please use either a,b,c or d");
		}
		System.out.println("");
		// question three
		System.out.println("Question three:Who invented Java");
		System.out.println("a)Grace Hopper\nb)Bill Gates\nc)James Goslin\nd)Mrs.Ward");
		System.out.print("Please input your answer:");
		q3 = input.readLine();
		System.out.println("");
		if (q3.equalsIgnoreCase("c")) {
			System.out.println("The answer to the question is correct");
			correctQuestion++;
		} else if (q3.equalsIgnoreCase("a") || q3.equalsIgnoreCase("b") || q3.equalsIgnoreCase("d")) {
			System.out.println(
					"These are the user of C++, Inventor of Python, teacher at London central, none invented Java!");
			wrong++;
		} else {
			System.out.println("That is an invaild input, please use either a,b,c or d");
		}
		System.out.println("");
		// question four
		System.out.println("Question four:What was the first computer language called");
		System.out.println("a)Plankalkül\nb)MySQL\nc)Scratch\nd)Basic");
		System.out.print("Please input your answer:");
		q4 = input.readLine();
		System.out.println("");
		if (q4.equalsIgnoreCase("a")) {
			System.out.println("The answer to the question is correct. It was used for the Z3 between 1943 and 1945!");
			correctQuestion++;
		} else if (q4.equalsIgnoreCase("c") || q4.equalsIgnoreCase("d")) {
			System.out.println("These languages are way too advanced for people 80 years ago!");
			wrong++;
		} else if (q4.equalsIgnoreCase("b")) {
			System.out.println("What? You consider a database a language?");
			wrong++;
		} else {
			System.out.println("That is an invaild input, please use either a,b,c or d");
		}
		System.out.println("");
		// question five
		System.out.println("Question five:What is the answer of i+++(i++)when int i=100");
		System.out.println("a)202\nb)203\nc)204\nd)201");
		System.out.print("Please input your answer:");
		q5 = input.readLine();
		System.out.println("");
		if (q5.equalsIgnoreCase("a")) {
			System.out.println("The answer to the question is correct");
			correctQuestion++;
		} else if (q5.equalsIgnoreCase("b") || q5.equalsIgnoreCase("c") || q5.equalsIgnoreCase("d")) {
			System.out.println("The answer to the question is wrong. Please re-consider the expression!");
			wrong++;
		} else {
			System.out.println("That is an invaild input, please use either a,b,c or d");
		}
		System.out.println("");
		// question six
		System.out.println("Question six:How much minimum RAM does morden computers have");
		System.out.println("a)4GB\nb)5GB\nc)8GB\nd)12GB");
		System.out.print("Please input your answer:");
		q6 = input.readLine();
		System.out.println("");
		if (q6.equalsIgnoreCase("b")) {
			System.out.println("The answer to the question is correct. Very smart!");
			correctQuestion++;
		} else if (q6.equalsIgnoreCase("a") || q6.equalsIgnoreCase("c") || q6.equalsIgnoreCase("d")) {
			System.out.println("Haha! You forgot to count in the 1GB default Virtual Memory on your disk!");
			wrong++;
		} else {
			System.out.println("That is an invaild input, please use either a,b,c or d");
		}
		System.out.println("");
		// question seven
		System.out.println("Question seven: Newest type of DDR memory are:");
		System.out.println("a)DDR2  b)DDR3 c)DDR4  d)DDR5");
		System.out.print("Please input your answer:");
		q7 = input.readLine();
		System.out.println("");
		if (q7.equalsIgnoreCase("c")) {
			System.out.println("The answer to the question is correct");
			correctQuestion++;
		} else if (q7.equalsIgnoreCase("b") || q7.equalsIgnoreCase("a") || q7.equalsIgnoreCase("d")) {
			System.out.println("The answer to the question is wrong. Do you live in another world?");
			wrong++;
		} else {
			System.out.println("That is an invaild input, please use either a,b,c or d");
		}
		System.out.println("");
		// question eight
		System.out.println("Question eight: Short cut for 'run'?");
		System.out.println("a)Ctrl+A\nb)Ctrl+B\nc)Ctrl+R\nd)Ctrl+O");
		System.out.print("Please input your answer:");
		q8 = input.readLine();
		System.out.println("");
		if (q8.equalsIgnoreCase("c")) {
			System.out.println("The answer to the question is correct");
			correctQuestion++;
		} else if (q8.equalsIgnoreCase("a") || q8.equalsIgnoreCase("b") || q8.equalsIgnoreCase("d")) {
			System.out.println("The answer to the question is wrong. Are you running on a MacOS?");
			wrong++;
		} else {
			System.out.println("That is an invaild input, please use either a,b,c or d");
		}
		System.out.println("");
		// question nine
		System.out.println("Question nine:What will you enter if you Hold F10/F12 at start");
		System.out.println("a)BIOS\nb)Safe Mode\nc)Windows desktop\nd)Restart");
		System.out.print("Please input your answer:");
		q9 = input.readLine();
		System.out.println("");
		if (q9.equalsIgnoreCase("a")) {
			System.out.println("The answer to the question is correct");
			correctQuestion++;
		} else if (q9.equalsIgnoreCase("b") || q9.equalsIgnoreCase("c") || q9.equalsIgnoreCase("d")) {
			System.out.println(
					"The answer to the question is wrong. Haven't you never come across a virus and can't start your computer?");
			wrong++;
		} else {
			System.out.println("That is an invaild input, please use either a,b,c or d");
		}
		System.out.println("");
		// question ten
		System.out.println("Question ten:What language is Eclipse for?");
		System.out.println("a)C++\nb)Python\nc)Java\nd)All of above");
		System.out.print("Please input your answer:");
		q10 = input.readLine();
		System.out.println("");
		if (q10.equalsIgnoreCase("d")) {
			System.out.println("The answer to the question is correct");
			correctQuestion++;
		} else if (q10.equalsIgnoreCase("b") || q10.equalsIgnoreCase("c") || q10.equalsIgnoreCase("a")) {
			System.out.println(
					"Hey! Eclipse isn't only for a single language! Add plugins for additional language support!");
			wrong++;
		} else {
			System.out.println("That is an invaild input, please use either a,b,c or d");
		}
		System.out.println("");
		// calc invaild number of inputs
		invaild = 10 - (correctQuestion + wrong);
		//assume the user is "messing with the program if there are more than 7 invaild inputs
		if (invaild>=7)
		{
			System.out.println("The system works fine! do not mess with the program with random inputs!");
			System.out.println("Restart the program if you want to try again!");
			System.exit(invaild);
		}
		else {
		
		
		System.out.println("That is it!");
		System.out.println(correctQuestion + " questions were answered right and " + wrong
				+ " questions were answered wrong. " + invaild + " questions had invaild input");
		// find the total percent
		percent = (correctQuestion / 10.0) * 100;
		System.out.println("That is " + percent + "% of overall questions answered right");
		System.out.println("");
		//give one of three statements based on the variable
		if (correctQuestion >= 7) {
			System.out.println("You have good knowleage in computers, good for you!");
		} else if (correctQuestion <= 7 && correctQuestion >= 5) {
			System.out.println("You have fair knowleage in computers, keep parcticing!");
		} else {
			System.out.println("Don't use java, use basic language instead!");
		}

		/*
		 * For Furture investgations for (i=0,i<=10,i++) { if (correct==1) {
		 * System.out.println("The answer to the question is correct");
		 * correctQuestion++; } else if (correct==2) {
		 * System.out.println("The answer to the question is wrong"); } else {
		 * System.out.println("That is an invaild input, please use either a,b,c or d");
		 * } questionNumber++; }
		 */
		}
	}
}