package unitone.test;
import java.io.DataInputStream;
import java.io.IOException;
public class TournamentSelectionLoop {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		String game;
		int wins=0;
		for (int i=1; i<=6; i++) {
			game=input.readLine();
			if (game.equals("W")) {
				wins++;
			}
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