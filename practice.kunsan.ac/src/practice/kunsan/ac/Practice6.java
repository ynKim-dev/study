package practice.kunsan.ac;

import java.util.*;

// 합계와 평균을 구하는 프로젝트
public class Practice6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float[] arr = new float[10];

		System.out.print("점수: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextFloat();
		}

		System.out.println("합계: " + Get_Sum(arr) + "\n평균: " + Get_Sum(arr) / 10);
		scan.close();
	}

	public static float Get_Sum(float[] arr) {
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}

}
