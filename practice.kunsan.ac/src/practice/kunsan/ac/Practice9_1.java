package practice.kunsan.ac;

import java.util.*;

// 0을 누르지 않을 때까지 정수를 입력하고 입력 받은 정수의 합계를 산출하는 프로젝트
public class Practice9_1 {

	public static void main(String[] args) {
		calculateArr();
	}

	public static void calculateArr() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();

		int sum = 0, number = 0, count = 0;

		System.out.print("0을 입력하면 입력 종료\nA: ");
		while (true) {
			number = scan.nextInt();

			if (number == 0)
				break;
			else
				arr.add(number);

			sum = sum + arr.get(count);
			count++;
		}
		System.out.println("Sum(A): " + sum);
		scan.close();

	}

}
