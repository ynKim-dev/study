package practice.kunsan.ac;

// 1부터 100까지 합산하는 프로젝트
public class Practice2 {

	public static void main(String[] args) {

		sum_Number();
	}

	public static void sum_Number() {
		int temp = 0;
		for (int i = 1; i <= 100; i++)
			temp = temp + i;
		System.out.println("합계: " + temp);
	}

}
