package practice.kunsan.ac;



// 사칙연산을 함수를 통해 계산하는 프로젝트
public class Practice10 {

	public static void main(String[] args) {

		float result = 0;
		result = subtract(divide(multiply(subtract(add(3, 5), 2), 2), 3), 4);

		System.out.println("(3 + 5 - 2) X 2 / 3 - 4 = " + result);
	}

	public static float add(float x, float y) {
		return x + y;
	}

	public static float subtract(float x, float y) {
		return x - y;
	}

	public static float multiply(float x, float y) {
		return x * y;
	}

	public static float divide(float x, float y) {
		return x / y;
	}
}
