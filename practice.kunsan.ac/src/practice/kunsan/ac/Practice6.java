package practice.kunsan.ac;

import java.util.*;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		float[] arr = new float[10];
		double sum = 0;

		System.out.print("점수: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextFloat();
			sum = sum + arr[i];
		}

		System.out.println("합계: " + sum + "\n평균: " + sum / 10);
		scan.close();
	}

}
