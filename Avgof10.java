package flowcontrol;

import java.io.DataInputStream;
import java.io.IOException;

public class Avgof10 {
	@SuppressWarnings("deprecation")
public static void main(String[] args) throws IOException {
	DataInputStream input = new DataInputStream(System.in);
	double mark = 0,average=0,total = 0;
	

	for (int i=1; i<=10; i++) {
	System.out.print("Please enter your "+i+" mark: ");
	mark=Double.parseDouble(input.readLine());
	total+=mark;

	}
	average=total/10;
	System.out.println("The average of your 10 marks is "+average);
}
}
