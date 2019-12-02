package ifStatement;

import java.io.DataInputStream;
import java.io.IOException;

public class Discount {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException{
		DataInputStream input = new DataInputStream(System.in);
		double cost,finalPrice=0;

//ask for total cost
		System.out.print("Please input your total cost of the purchase");
		cost=Double.parseDouble(input.readLine());
//if the total cost is less than zero
		if(cost<=0)
		{
			System.out.println("Your total cost in invaild");
		}

		else if(cost<10.0)
		{
			System.out.println("You are not entitled to recieve a discount");
			finalPrice=cost;
		}

		else
		{
			System.out.println("You will receive a 10% discount on your purchase");
			finalPrice=cost*0.9;
		}


		System.out.print("Your final cost is: "+finalPrice);
	}

}


