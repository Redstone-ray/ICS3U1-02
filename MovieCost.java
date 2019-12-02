package ifStatement;
import java.io.*;
public class MovieCost {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)  throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		int age;
		
		System.out.print("Please input your age");
		age=Integer.parseInt(input.readLine());
		
		if(age<1)
		{
			System.out.println("Your age is invaild");
		}
		
		else if(age>120)
		{
			System.out.println("You are too old to watch a movie");
		}
		
		
		else if(age<=12)
		{
			System.out.println("A child's ticket will cost $6.00");
		}
		
		
		else if(age<=65)
		{
			System.out.println("A adult's ticket will cost $12.00");
		}
		
		
		else
		{
			System.out.println("A senior's ticket will cost $8.00");
		}
		System.out.print("Goodbye for now");
	}

}
