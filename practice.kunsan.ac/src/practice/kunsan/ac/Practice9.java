package practice.kunsan.ac;

// 시저의 암호기법을 적용하는 프로젝트
public class Practice9 {

	private static Scanner inputNumber = new Scanner(System.in);
	private static Scanner inputText = new Scanner(System.in);
	private static Scanner inputCipher = new Scanner(System.in);

	public static void main(String[] args) {

		printMenu();
	}

	public static void printMenu() {
		int number = 0;
		while (true) {
			System.out.println("1.암호화\n2.복호화\n3.종료");
			number = inputNumber.nextInt();
			if (number == 1)
				encryptCipher();
			else if (number == 2)
				decryptCipher();
			else if (number == 3)
				break;
			else
				continue;
		}
		inputNumber.close();
		inputText.close();
		inputCipher.close();
	}

	public static void encryptCipher() {
		String text, answer = "";
		int number = 0;
		char letter = 0;

		System.out.println("암호화할 문장을 입력하세요!");
		text = inputText.nextLine();

		for (int i = 0; i < text.length(); i++) {
			letter = text.charAt(i);

			number = (int) letter;

			if ((number >= 97 && number <= 119) || (number >= 65 && number <= 87))
				number = number + 3;
			else if ((number >= 120 && number <= 122) || (number >= 88 && number <= 90))
				number = number - 29;

			answer = answer + (char) number;

		}
		System.out.println("평문: " + text + "\n" + "암호문: " + answer);
	}

	public static void decryptCipher() {
		String text, answer = "";
		int number = 0;
		char letter = 0;

		System.out.println("복호화할 문장을 입력하세요!");
		text = inputCipher.nextLine();

		for (int i = 0; i < text.length(); i++) {
			letter = text.charAt(i);

			number = (int) letter;

			if ((number >= 97 && number <= 99) || (number >= 65 && number <= 67))
				number = number + 29;
			else if ((number >= 100 && number <= 122) || (number >= 68 && number <= 90))
				number = number - 3;

			answer = answer + (char) number;

		}
		System.out.println("암호문: " + text + "\n" + "평문: " + answer);
	}

}
