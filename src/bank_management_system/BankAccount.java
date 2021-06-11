package bank_management_system;

// 계좌 클래스 
public class BankAccount {
	String name, account;
	int money;

	public BankAccount(String name, String account, int money) {
		this.name = name;
		this.account = account;
		this.money = 0;
	}

	public void set_Money(int money) {
		this.money = money;
	}

	public String get_Name() {
		return name;
	}

	public String get_Account() {
		return account;
	}

	public int get_Money() {
		return money;
	}

	public String money_To_String() {
		int count = 0;
		char check_Text;
		String text, return_Text = "", reverse = "";
		text = this.money + "원";

		// 계좌에 있는 잔액의 표기법을 변경하는 메소드
		for (int i = (int) text.length() - 1; i >= 0; i--) {
			check_Text = text.charAt(i);
			if (check_Text == '0')
				count++;

			return_Text = return_Text + check_Text;
			if (count == 3) {
				count = 0;
				if ((i - 1) == 0)
					continue;
				return_Text = return_Text + ",";
			}
		}

		for (int i = (int) return_Text.length() - 1; i >= 0; i--) {
			check_Text = return_Text.charAt(i);
			reverse = reverse + check_Text;
		}
		return reverse;
	}

	public String money_To_String(int money) {
		int count = 0;
		char check_Text;
		String text, return_Text = "", reverse = "";
		text = money + "원";

		for (int i = (int) text.length() - 1; i >= 0; i--) {
			check_Text = text.charAt(i);
			if (check_Text == '0')
				count++;

			return_Text = return_Text + check_Text;
			if (count == 3) {
				count = 0;
				return_Text = return_Text + ",";
			}
		}

		for (int i = (int) return_Text.length() - 1; i >= 0; i--) {
			check_Text = return_Text.charAt(i);
			reverse = reverse + check_Text;
		}
		return reverse;
	}
}
