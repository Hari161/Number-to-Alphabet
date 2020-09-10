package examples;

import java.util.Scanner;

public class Alpha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1, temp1 = 0, count = 0, temp2 = 0;
		char[] a2 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		System.out.print("Enter any number:");
		long n1, m1;
		n1 = sc.nextLong();
		m1 = n1;

		// checking the value if it is one for easy access

		if (n1 == 1) {
			System.out.print("Alphabet Regarding Number :" + n1 + " : " + a2[1 - 1]);

		}

		// checking if the digit is zero

		else if (n1 == 0) {
			System.out.println("Enter a number ranging from 1");
		}

		else {
			while (m1 > 0) {

				a1 = (int) (m1 % 10);

				// doing reverse to get single digit for finding respective alphabet

				if (a1 == 0) {
					// System.out.println("0 is not a valid number");
				}

				else {
					System.out.println("Alphabet Regarding Number :" + a1 + " : " + a2[a1 - 1]);
				}

				// for finding combination of digits starting here*******

				// temp1 is temporary variable to store each digit
				// temp2 is to store the second digit that we get from reverse
				// so next time if we have a number it will add into the position of zero and so
				// on

				// converting into string for concatenation

				temp1 = a1;
				String ss1 = Integer.toString(temp1);
				String ss2 = Integer.toString(temp2);

				// joining two strings together

				String cc = ss1 + ss2;

				// changing it into number to find if it is available array

				int cc1 = Integer.parseInt(cc);

				// setting an counter variable to skip first step to avoid being added by zero
				// at the end

				if (count == 0) {

				} else {

					// checking the combination that varying from 10 to 26 to avoid array index out
					// of bond exception

					if (cc1 >= 10 && cc1 <= 26) {
						System.out.println("Alphabet Regarding Number combination of :" + cc1 + " : " + a2[cc1 - 1]);

					}
				}
				count++;
				temp2 = a1;
				m1 = m1 / 10;

			} // while loop closing

		} // else closing

	}

}
