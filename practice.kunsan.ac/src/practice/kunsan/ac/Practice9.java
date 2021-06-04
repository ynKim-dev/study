package practice.kunsan.ac;

public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello World";
		String answer = "";
		int number = 0;
		char temp = 0;

		for (int i = 0; i < text.length(); i++) {
			temp = text.charAt(i);

			number = (int) temp;

			if ((number >= 97 && number <= 119) || (number >= 65 && number <= 87))
				number = number + 3;
			else if ((number >= 120 && number <= 122) || (number >= 88 && number <= 90))
				number = number - 29;

			answer = answer + (char) number;

		}
		System.out.println(text + "\n" + answer);
	}

}
