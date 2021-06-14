package bank_management_system;

// 계좌 클래스 
public class BankAccount {
	String name, accountID;
	int money;

	public BankAccount(String name, String accountID, int money) {
		this.name = name;
		this.accountID = accountID;
		this.money = 0;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public String getAccountID() {
		return accountID;
	}

	public int getMoney() {
		return money;
	}

	public String moneyToString() {
		int count = 0;
		char cText;
		String text, rText = "", reverse = "";
		text = this.money + "원";

		// 계좌에 있는 잔액의 표기법을 변경하는 메소드
		for (int i = (int) text.length() - 1; i >= 0; i--) {
			cText = text.charAt(i);
			if (cText == '0')
				count++;

			rText = rText + cText;
			if (count == 3) {
				count = 0;
				if ((i - 1) == 0)
					continue;
				rText = rText + ",";
			}
		}

		for (int i = (int) rText.length() - 1; i >= 0; i--) {
			cText = rText.charAt(i);
			reverse = reverse + cText;
		}
		return reverse;
	}

	public String moneyToString(int money) {
		int count = 0;
		char cText;
		String text, rText = "", reverse = "";
		text = money + "원";

		for (int i = (int) text.length() - 1; i >= 0; i--) {
			cText = text.charAt(i);
			if (cText == '0')
				count++;

			rText = rText + cText;
			if (count == 3) {
				count = 0;
				rText = rText + ",";
			}
		}

		for (int i = (int) rText.length() - 1; i >= 0; i--) {
			cText = rText.charAt(i);
			reverse = reverse + cText;
		}
		return reverse;
	}
}
