package practice.kunsan.ac;

import java.util.*;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int temp = 0;

		System.out.print("Enter line number: ");
		temp = scan.nextInt();

		for (int i = 1; i <= temp; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		scan.close();

	}

}
