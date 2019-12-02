package ifStatement.review;

import java.io.DataInputStream;
import java.io.IOException;

public class RealRoots {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		int a,b,c;
		double x1,x2;
		System.out.print("Enter the value of 'a'");
		a=Integer.parseInt(input.readLine());
		if (a==0)
		{
			System.out.println("That equation is not a quadratic equation");
			System.exit(0);
		}
		System.out.print("Enter the value of 'b'");
		b=Integer.parseInt(input.readLine());
		System.out.print("Enter the value of 'c'");
		c=Integer.parseInt(input.readLine());
		
		if (b*b-4*a*c<0)
		{
			System.out.println("that Quadratic equation has no real roots");
		}
		else if (b*b-4*a*c==0)
		{
			x1=-b/(2*a);
			System.out.println("There is one root x="+x1);
		}
		else if (b*b-4*a*c>0)
		{
			x1=(-b+Math.sqrt(b*b-4*a*c)/(2*a));
			x2=(-b-Math.sqrt(b*b-4*a*c)/(2*a));
			System.out.println("There are two real roots for x, where x1="+x1+" and x2="+x2);
		}
	}	
	
}