package practice.kunsan.ac;

import java.util.*;

// 섭씨 온도를 화씨 온도로 변환하는 프로젝트
public class Check_Temp {

	public static void main(String[] args) {

		Check_Temperature();
	}

	public static void Check_Temperature() {
		Scanner scan = new Scanner(System.in);
		double temp = 0, temp1 = 0;
		System.out.print("섭씨: ");
		temp = scan.nextFloat();
		temp1 = (temp * 1.8) + 32;
		System.out.println("화씨: " + temp1);
		scan.close();
	}

}
