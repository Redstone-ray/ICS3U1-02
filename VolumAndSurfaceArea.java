package userInput;

import java.io.DataInputStream;
import java.io.IOException;

public class VolumAndSurfaceArea {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		double rad,ht,vol,sArea;
		DataInputStream input = new DataInputStream(System.in);
		
		System.out.print("Please enter the radius");
		rad=Double.parseDouble(input.readLine());
		
		System.out.print("Please enter the height");
		ht=Double.parseDouble(input.readLine());
		
		vol=3.14*rad*rad*ht;
		sArea=2*3.14*rad*ht+2*3.14*rad*rad;
			
		System.out.println("The volume is: "+vol);
		System.out.println("The surface area is: "+sArea);
		
		

	}

}
