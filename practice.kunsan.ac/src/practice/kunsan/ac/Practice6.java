package practice.kunsan.ac;


// 합계와 평균을 구하는 프로젝트
public class Practice6 {

	public static void main(String[] args) {

		float[] arr = new float[10];
		String text = "90,75,85,95,70,75,85,85,95,72";
		char cText;
		int count = 0, number = 0, cNumber = 0;
		System.out.println("점수: " + text);
		for (int i = text.length() - 1; i >= 0; i--) {

			cText = text.charAt(i);

			if (cText == ',') {
				arr[count] = (float) number;
				count++;
				cNumber = 0;
				number = 0;
			} else if ((int) cText >= 48 && (int) cText <= 58) {
				number = number + ((int) cText - 48) * (int) Math.pow(10, cNumber);
				cNumber++;
				if (i == 0) {
					arr[count] = (float) number;
				}
			} else
				continue;

		}

		System.out.println("합계: " + getSum(arr) + "\n평균: " + getSum(arr) / 10);

	}

	public static float getSum(float[] arr) {
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}

}
