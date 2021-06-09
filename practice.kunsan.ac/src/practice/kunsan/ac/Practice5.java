package practice.kunsan.ac;

import java.util.*;

//학점 계산 프로젝트
public class Practice5 {

	public static void main(String[] args) {
		calculate_Grade();
	}

	public static void calculate_Grade() {

		int number = check_Number();
		String grade = "";

		if (number >= 90)
			grade = "A";
		else if (number >= 80)
			grade = "B";
		else if (number >= 70)
			grade = "C";
		else if (number >= 60)
			grade = "D";
		else if (number < 60)
			grade = "F";

		System.out.println("학점: " + grade);

	}

	// 점수의 이상 값들을 감지해서 다시 입력받게 하는 함수
	public static int check_Number() {
		Scanner scan = new Scanner(System.in);
		int input_number = 0;
		while (true) {
			try {
				System.out.print("점수 입력: ");
				input_number = scan.nextInt();
				if (input_number >= 0 && input_number <= 100)
					break;
				else
					throw new Exception();

			} catch (InputMismatchException ime) {
				System.out.println("정수 값만 입력하세요!!");
				scan.next();
				continue;
			} catch (Exception e) {
				System.out.println("0부터 100 사이 값만 입력하세요!!");
				continue;
			}
		}
		scan.close();
		return input_number;
	}

}
