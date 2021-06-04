package practice.kunsan.ac;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 90, 80, 80 }, { 85, 85, 95 }, { 95, 70, 75 }, { 80, 80, 90 }, { 90, 75, 80 } };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
			System.out.print("ID = " + i + " 합계 = " + sum + " 평균 = " + (float) sum / 10 + "\n");
			sum = 0;
		}
	}

}
