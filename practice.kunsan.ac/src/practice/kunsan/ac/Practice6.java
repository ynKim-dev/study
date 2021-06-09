package practice.kunsan.ac;


// 합계와 평균을 구하는 프로젝트
public class Practice6 {

	public static void main(String[] args) {

		float[] arr = new float[10];
		String text = "90,75,85,95,70,75,85,85,95,72";
		char check_Text;
		int count = 0, number = 0, count_Number = 0;
		System.out.println("점수: " + text);
		for (int i = text.length() - 1; i >= 0; i--) {

			check_Text = text.charAt(i);

			if (check_Text == ',') {
				arr[count] = (float) number;
				count++;
				count_Number = 0;
				number = 0;
			} else if ((int) check_Text >= 48 && (int) check_Text <= 58) {
				number = number + ((int) check_Text - 48) * (int) Math.pow(10, count_Number);
				count_Number++;
				if (i == 0) {
					arr[count] = (float) number;
				}
			} else
				continue;

		}

		System.out.println("합계: " + get_Sum(arr) + "\n평균: " + get_Sum(arr) / 10);

	}

	public static float get_Sum(float[] arr) {
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}

}
