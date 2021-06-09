package practice.kunsan.ac;

import java.util.*;

public class Main {

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
