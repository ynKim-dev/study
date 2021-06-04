package practice.kunsan.ac;

import java.util.*;

public class Practice9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int sum = 0, number = 0, count = 0;
		
		
		System.out.print("0을 입력하면 입력 종료\nA: ");
		while(true)
		{
			number = scan.nextInt();
			
			if(number == 0) break;
			else arr.add(number);
			
			sum = sum + arr.get(count);
			count++;
		}
		System.out.println("Sum(A): " + sum);
		scan.close();
		
	}

}
