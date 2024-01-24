package Tasks;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);

		int userInput = obj.nextInt();

		if (userInput > 0) {
			System.out.print(userInput + " Positive ");
		} else if (userInput < 0) {
			System.out.print(userInput + " Negative ");
		} else {
			System.out.print("The number is zero");
		}

	}

}