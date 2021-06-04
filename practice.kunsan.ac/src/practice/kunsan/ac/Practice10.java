package practice.kunsan.ac;

import java.util.*;

// 사칙연산을 함수를 통해 계산하는 프로젝트
public class Practice10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float number1 = 0, number2 = 0, count = 0;

		System.out.print("숫자 입력(처음 입력시, 2개 입력) : ");
		while (true) {
			if (count == 0)
				number1 = scan.nextFloat();

			number2 = scan.nextFloat();

			if (count == 0) {
				System.out.println(number1 + " + " + number2);
				number1 = add(number1, number2);

			} else if (count == 1 || count == 4) {
				System.out.println(number1 + " - " + number2);
				number1 = subtract(number1, number2);
			} else if (count == 2) {
				System.out.println(number1 + " X " + number2);
				number1 = multiply(number1, number2);
			} else if (count == 3) {
				System.out.println(number1 + " / " + number2);
				number1 = divide(number1, number2);
			}

			if (count == 4)
				break;
			count++;
		}
		scan.close();
	}

	public static float add(float x, float y) {
		return x + y;
	}

	public static float subtract(float x, float y) {
		return x - y;
	}

	public static float multiply(float x, float y) {
		return x * y;
	}

	public static float divide(float x, float y) {
		return x / y;
	}
}
