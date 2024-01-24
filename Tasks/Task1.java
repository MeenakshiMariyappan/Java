package Tasks;
import java.util.Scanner;

//Write a program to print the numbers from 10 to 50 using for loop/while loop 

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int start = scanner.nextInt();

		int end = scanner.nextInt();

		while (start <= end) {
			System.out.print(start + "\n");
			start++;
		}

	}

}
