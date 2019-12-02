package unitone.test;

import java.io.DataInputStream;
import java.io.IOException;

public class TournamentSelection
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		String g1,g2,g3,g4,g5,g6;
		int wins=0;
		g1=input.readLine();
		g2=input.readLine();
		g3=input.readLine();
		g4=input.readLine();
		g5=input.readLine();
		g6=input.readLine();
		if (g1.equals("W")) {
			wins++;
		}
		if (g2.equals("W")) {
			wins++;
		}
		if (g3.equals("W")) {
			wins++;
		}
		if (g4.equals("W")) {
			wins++;
		}
		if (g5.equals("W")) {
			wins++;
		}
		if (g6.equals("W")) {
			wins++;
		}
		if (wins>=5) {
			System.out.println("1");
		}
		else if (wins>=3) {
				System.out.println("2");
		}
		else if (wins>=1) {
			System.out.println("3");
		}
		else {
			System.out.println("-1");
		}
	

	}
}
