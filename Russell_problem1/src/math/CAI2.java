package math;
import java.util.*;
import java.security.SecureRandom;
public class CAI2 {
	protected static String answer;
	protected static int option;
	protected static int a, b, c;
	private static final Scanner op = new Scanner(System.in);
	public static int quiz(int a, int b) {
		SecureRandom rand = new SecureRandom();
		a = rand.nextInt(10);
		b = rand.nextInt(10);
		askQuestion(a, b);
		readResponse(op);
		isAnswerCorrect(a, b);
		return b * a;
	}
	public static void askQuestion(int a, int b) {
		System.out.println("How much is "+a+" times "+b);
	}
	public static void readResponse(Scanner op) {
		System.out.print("\nYour answer: ");
		option = op.nextInt();
	}
	public static void isAnswerCorrect(int a, int b) {
		do {
			c = b * a;
			do {
				if (option == c) {
					displayCorrectResponse();
					quiz(a, b);
				}
				else {
					displayIncorrectResponse();
				}
				readResponse(op);
			}
			while (option != (b * a));
		}
		while (b * a == c);
	}
	public static void displayCorrectResponse() {
		int choose = random(1, 4);
		if (choose == 1) {
			System.out.println("Very good!");
		}
		if (choose == 2) {
			System.out.println("Excellent");
		}
		if (choose == 3) {
			System.out.println("Nice work!");
		}
		if (choose == 4) {
			System.out.println("Keep up the good work!");
		}
	}
	public static void displayIncorrectResponse() {
		int choice = random(1, 4);
		if(choice == 1) {
			System.out.println("No. Please try again.");
		}
		if(choice == 2) {
			System.out.println("Wrong. Try once more.");
		}
		if(choice == 3) {
			System.out.println("Don't give up just yet!");
		}
		if (choice == 4) {
			System.out.println("Nope. Keep trying!");
		}
	}
	public static int random(int m, int n) {
		SecureRandom rand = new SecureRandom();
		int o = (int)(rand.nextDouble()*((n - m) + 1)) + m;
		return o;
	}
	public static void main(String[] args) {
		quiz(a, b);
	}
}
