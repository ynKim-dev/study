package practice.kunsan.ac;

import java.util.*;

// 별표 출력 프로젝트
public class Practice4 {

	public static void main(String[] args) {
		createStarTriangle();
	}

	public static void createStarTriangle() {
		Scanner scan = new Scanner(System.in);

		int number = 0;

		System.out.print("Enter line number: ");
		number = scan.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		scan.close();

	}

}
