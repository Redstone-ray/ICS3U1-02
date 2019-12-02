package ifStatement.review;

import java.io.*;

public class Restaurant {

	static double mealCost, hst, tip, totalCost;
	static int mealSelection, popNum;
	static String pop;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);

		System.out.println("Welcome to Costco, following is our menu:");

		System.out.println("	1 - Whole beef hotdog                          $1.5");
		System.out.println("	2 - Pizza slice                                $2.29");
		System.out.println("	3 - Fries and chicken stripe                   $6.49");
		System.out.println("	4 - Pountine 			               $4.49");
		System.out.println("	5 - Ten pieces chicken                         $6.79");
		System.out.println("");
		System.out.print("Please enter your selection: ");
		mealSelection = Integer.parseInt(input.readLine());

		if (mealSelection == 1) {
			System.out.println("You ordered Combo one");
			System.out.print("Would you like additional pop for $1 each? Y/N");
			pop = input.readLine();
			if (pop.equalsIgnoreCase("Y")) {
				System.out.print("How many pop would you like");
				popNum = Integer.parseInt(input.readLine());
				if (popNum < 1) {
					System.out.println("I can't give you this many pop");
					mealCost = 1.5;
				} else if (popNum > 100) {
					System.out.println("Do not waste any pop");
					mealCost = 1.5;
				} else {
					mealCost = 1.5 + popNum;
				}

			} else {
				mealCost = 1.5;
			}

		}

		else if (mealSelection == 2) {
			System.out.println("You ordered Combo two");
			System.out.print("Would you like additional pop for $1 each? Y/N");
			pop = input.readLine();
			if (pop.equalsIgnoreCase("T")) {
				System.out.print("How many pop would you like");
				popNum = Integer.parseInt(input.readLine());
				if (popNum < 1) {
					System.out.println("I can't give you this many pop");
					mealCost = 2.29;
				} else if (popNum > 100) {
					System.out.println("Do not waste any pop");
					mealCost = 2.29;
				} else {
					mealCost = 2.29 + popNum;
				}

			} else {
				mealCost = 2.29;
			}

		}

		else if (mealSelection == 3) {
			System.out.println("You ordered Combo three");
			System.out.print("Would you like additional pop for $1 each? Y/N");
			pop = input.readLine();
			if (pop.equalsIgnoreCase("Y")) {
				System.out.print("How many pop would you like");
				popNum = Integer.parseInt(input.readLine());
				if (popNum < 1) {
					System.out.println("I can't give you this many pop");
					mealCost = 6.49;
				} else if (popNum > 100) {
					System.out.println("Do not waste any pop");
					mealCost = 6.49;
				} else {
					mealCost = 6.49 + popNum;
				}

			} else {
				mealCost = 6.49;
			}

		}

		else if (mealSelection == 4) {
			System.out.println("You ordered Combo four");
			System.out.print("Would you like additional pop for $1 each? Y/N");
			pop = input.readLine();
			if (pop.equalsIgnoreCase("Y")) {
				System.out.print("How many pop would you like");
				popNum = Integer.parseInt(input.readLine());
				if (popNum < 1) {
					System.out.println("I can't give you this many pop");
					mealCost = 4.49;
				} else if (popNum > 100) {
					System.out.println("Do not waste any pop");
					mealCost = 4.49;
				} else {
					mealCost = 4.49 + popNum;
				}

			} else {
				mealCost = 4.49;
			}

		}

		else if (mealSelection == 5) {
			System.out.println("You ordered Combo one");
			System.out.print("Would you like additional pop for $1 each? Y/N");
			pop = input.readLine();
			if (pop.equalsIgnoreCase("y")) {
				System.out.print("How many pop would you like");
				popNum = Integer.parseInt(input.readLine());
				if (popNum < 1) {
					System.out.println("I can't give you this many pop");
					mealCost = 6.79;
				} else if (popNum > 100) {
					System.out.println("Do not waste any pop");
					mealCost = 6.79;
				} else {
					mealCost = 6.79 + popNum;
				}

			} else {
				mealCost = 6.79;
			}

		} else {
			System.out.println("That is a invalid combo number");
			System.out.println("Exit the program, please run again");
			System.exit(1);
		}
		hst = mealCost * 0.13;
		tip = mealCost * 0.15;
		totalCost = mealCost + hst + tip;
		System.out.println("Meal Cost           $" + mealCost);
		System.out.println("HST                 $" + hst);
		System.out.println("Tip                 $" + tip);
		System.out.println("Total cost          &" + totalCost);

	}

}