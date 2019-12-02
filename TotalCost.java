package userInput;

import java.io.DataInputStream;
import java.io.IOException;

public class TotalCost {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		double unitCost,totalCost;
		int quantity;
		DataInputStream input = new DataInputStream(System.in);
		
		System.out.print("Please enter the unit cost");
		unitCost=Double.parseDouble(input.readLine());
		
		System.out.print("Please enter the quanitity");
		quantity=Integer.parseInt(input.readLine());
		/*
		vol=3.14*rad*rad*ht;
		sArea=2*3.14*rad*ht+2*3.14*rad*rad;
			
		System.out.println("The volume is: "+vol);
		System.out.println("The surface area is: "+sArea);
		*/
		
	}
}
