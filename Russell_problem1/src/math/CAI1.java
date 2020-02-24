package math;
import java.util.*;
import java.security.SecureRandom;
public class CAI1 {
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
		System.out.println("Very good!");
	}
	public static void displayIncorrectResponse() {
		System.out.println("No. Please try again.");
		readResponse(op);
	}
	public static void main(String[] args) {
		quiz(a, b);
	}
}
