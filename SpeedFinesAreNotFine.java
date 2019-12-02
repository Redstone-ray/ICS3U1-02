package unitone.test;
import java.io.DataInputStream;
import java.io.IOException;
public class SpeedFinesAreNotFine {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		int carSpeed = 0, limitSpeed = 0, fine = 0;
		System.out.print("Enter the speed limit: ");
		limitSpeed = Integer.parseInt(input.readLine());
		System.out.print("Enter the recorded speed of the car: ");
		carSpeed = Integer.parseInt(input.readLine());
		if (carSpeed > limitSpeed && (carSpeed - limitSpeed) <= 20) {
			fine = 100;
		} 
		else if (carSpeed > limitSpeed && (carSpeed - limitSpeed) <= 30) {
			fine = 270;
		} else if (carSpeed > limitSpeed && (carSpeed - limitSpeed) > 30) {
			fine = 500;
		} else {
			System.out.println("Congratulations, you are within the speed limit!");
		}
		if (fine > 0) {
			System.out.println("You are speeding and your fine is $" + fine);
		}
	}

}