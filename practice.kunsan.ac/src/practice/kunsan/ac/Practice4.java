package practice.kunsan.ac;

import java.util.*;

// 별표 출력 프로젝트
public class Practice4 {

	public static void main(String[] args) {
		create_Star_Triangle();
	}

	public static void create_Star_Triangle() {
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
