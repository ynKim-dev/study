package practice.kunsan.ac;

import java.util.*;

public class Check_Temp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double temp = 0, temp1 = 0;
		System.out.print("����: " );
		temp = scan.nextFloat();
		temp1 = (temp * 1.8) + 32;
		System.out.println("ȭ��: " + temp1);
		scan.close();
	}

}
