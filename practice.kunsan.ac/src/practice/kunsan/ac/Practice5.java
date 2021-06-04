package practice.kunsan.ac;

import java.util.*;

//학점 계산 프로젝트
public class Practice5 {

	public static void main(String[] args) {
		calculate_Grade();
	}

	public static void calculate_Grade() {
		Scanner scan = new Scanner(System.in);

		int number = 0;
		String grade = "";
		System.out.print("점수 입력: ");
		number = scan.nextInt();

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
		scan.close();
	}

}
