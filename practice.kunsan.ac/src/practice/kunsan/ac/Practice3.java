package practice.kunsan.ac;

// 구구단 출력하는 프로젝트
public class Practice3 {

	public static void main(String[] args) {
		MultiplicationTable();
	}

	public static void MultiplicationTable() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 1)
					System.out.println("** " + i + "**");

				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
	}

}
