package practice.kunsan.ac;

// 알파벳 대소문자를 서로 변경하는 프로젝트
public class Practice8 {

	public static void main(String[] args) {
		change_Alphabat();
	}

	public static void change_Alphabat() {
		String text = "Hello World";
		String answer = "";
		int number = 0;
		char temp = 0;

		for (int i = 0; i < text.length(); i++) {
			temp = text.charAt(i);

			number = (int) temp;

			if (number >= 97 && number <= 122)
				number = number - 32;
			else if (number <= 90 && number >= 65)
				number = number + 32;

			answer = answer + (char) number;

		}
		System.out.println(text + "\n" + answer);
	}

}
