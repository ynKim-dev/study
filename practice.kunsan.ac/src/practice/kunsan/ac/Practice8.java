package practice.kunsan.ac;

// 알파벳 대소문자를 서로 변경하는 프로젝트
public class Practice8 {

	public static void main(String[] args) {
		flipCase();
	}

	public static void flipCase() {
		Scanner scan = new Scanner(System.in);

		char letter = 0;
		String answer = "";

		System.out.println("문장을 입력하시오!");
		String text = scan.nextLine();

		for (int i = 0; i < text.length(); i++) {
			letter = text.charAt(i);

			if (Character.isUpperCase(letter) == true) {
				answer = answer + Character.toLowerCase(letter);
			} else {
				answer = answer + Character.toUpperCase(letter);
			}

		}

		System.out.println("원본: " + text + "\n변경: " + answer);
		scan.close();
	}

}
