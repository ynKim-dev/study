package practice.kunsan.ac;

import java.util.*;

// 섭씨 온도를 화씨 온도로 변환하는 프로젝트
public class Check_Temp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double temperature = 0;
		System.out.print("섭씨: ");
		temperature = scan.nextFloat();
		System.out.println("화씨: " + change_Celsius_To_Fahrenheit(temperature));
		scan.close();
	}

	public static double change_Celsius_To_Fahrenheit(double temperature) {

		return (temperature * 1.8) + 32;
	}

}
