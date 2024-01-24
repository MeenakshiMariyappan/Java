package Tasks;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the purchase amount: ");
		double purchaseAmount = scanner.nextDouble();

		double discount = 0.0;

		if (purchaseAmount < 500) {
			discount = 0.0;
		} else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
			discount = 0.1 * purchaseAmount;
		} else {
			discount = 0.2 * purchaseAmount;
		}

		double payableAmount = purchaseAmount - discount;

		System.out.println("Purchase Amount: " + purchaseAmount);
		System.out.println("Discount: " + discount);
		System.out.println("Final Payable Amount: " + payableAmount);

	}

}
