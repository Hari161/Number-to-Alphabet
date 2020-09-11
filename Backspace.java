package examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Backspace {

	public static boolean check(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)) == false)

				return false;

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		String s = sc.nextLine();
		if (check(s)) {
			System.out.print("The number is integer");
		} else {
			throw new InputMismatchException("There is a character in the given number");
		}
	}
}
