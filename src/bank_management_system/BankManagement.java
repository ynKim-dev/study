package bank_management_system;

import java.util.*;

public class BankManagement {
	public Scanner scan = new Scanner(System.in);
	ArrayList<BankAccount> BankAccounts = new ArrayList<BankAccount>();

	public void printMenu() {
		int cmd = 0;
		boolean isRunningMenu = true;

		while (isRunningMenu) {
			System.out.print(BankMessage.MSG_SELECT_MENU);
			cmd = checkNumber();

			switch (cmd) {
			case BankCommand.CMD_CREATE:
				createAccount();
				break;
			case BankCommand.CMD_LOOKUP_LIST:
				printList();
				break;
			case BankCommand.CMD_DEPOSIT:
				depositMoney();
				break;
			case BankCommand.CMD_WITHDRAW:
				withdrawMoney();
				break;
			case BankCommand.CMD_CHECK_BALANCE:
				printMyAccount();
				break;
			case BankCommand.CMD_REMIT:
				remitMoney();
				break;
			case BankCommand.CMD_EXIT:
				isRunningMenu = false;
				break;

			}

		}
	}

	public int checkNumber() {
		int number = 0;

		while (true) {
			try {
				number = scan.nextInt();
				if (number < 0)
					throw new Exception();
				break;
			} catch (InputMismatchException e) {
				System.out.println(BankMessage.MSG_INPUT_INTEGER_FAIL);
				scan.next();
			} catch (Exception e) {
				System.out.println(BankMessage.MSG_INPUT_POSITIVE_NUMBER_FAIL);
				continue;
			}
		}

		return number;
	}

	public void createAccount() {
		String name, accountID;
		Random rand = new Random();

		System.out.print(BankMessage.MSG_INPUT_NAME);
		name = scan.next();
		accountID = (rand.nextInt(100) + 1) + "-" + (rand.nextInt(1000) + 1);
		BankAccounts.add(new BankAccount(name, accountID, 0));
		System.out.println(BankMessage.MSG_CREATE_SUCCESS);
	}

	public void printList() {

		System.out.println("저장된 계좌의 정보를 출력합니다!!");
		for (BankAccount bankAccount : BankAccounts) {
			System.out.println("계좌 " + bankAccount.getAccountID() + "( 예금주 : " + bankAccount.getName() + " )");
			System.out.println("잔엑 : " + bankAccount.moneyToString());
		}
	}

	public void depositMoney() {
		String account;
		int money = 0;

		System.out.println("입금할 계좌 번호 입력 ");
		account = scan.next();

		for (BankAccount bankAccount : BankAccounts) {
			if (bankAccount.getAccountID().equals(account) == true) {
				System.out.println("잔엑 : " + bankAccount.moneyToString());
				System.out.print("입금할 금액 입력 : ");
				money = checkNumber();
				bankAccount.setMoney(bankAccount.getMoney() + money);
				System.out.println(bankAccount.moneyToString(money) + " 입금합니다.");
			}
		}

	}

	public void withdrawMoney() {
		String account;
		int money = 0;

		System.out.println("출금할 계좌 번호 입력  ");
		account = scan.next();

		for (BankAccount bankAccount : BankAccounts) {
			if (bankAccount.getAccountID().equals(account) == true) {
				System.out.println("잔엑 : " + bankAccount.moneyToString());
				System.out.print("출금할 금액 입력 : ");
				money = checkNumber();
				if (money > bankAccount.getMoney()) {
					System.out.println(BankMessage.MSG_WITHDRAW_FAIL);
				} else {
					bankAccount.setMoney(bankAccount.getMoney() - money);
					System.out.println(bankAccount.moneyToString(money) + " 출금합니다.");
				}
			}
		}
	}

	public void printMyAccount() {
		String account;

		System.out.println("확인할 계좌 번호 입력  ");
		account = scan.next();

		for (BankAccount bankAccount : BankAccounts) {
			if (bankAccount.getAccountID().equals(account) == true) {
				System.out.println("계좌 " + bankAccount.getAccountID() + "( 예금주 : " + bankAccount.getName() + " )");
				System.out.println("잔엑 : " + bankAccount.moneyToString());
			}
		}
	}

	public void remitMoney() {

		int money = 0;
		String owner, sender;
		System.out.println("자신의 계좌 번호 입력 ");
		owner = scan.next();
		System.out.println("송금할 사람의 계좌 번호 입력 ");
		sender = scan.next();

		for (BankAccount bankAccount : BankAccounts) {
			if (bankAccount.getAccountID().equals(owner) == true) {
				System.out.println("송금할 금액 입력 ");
				money = checkNumber();
				System.out.println("잔엑 : " + bankAccount.moneyToString());
				if (money > bankAccount.getMoney()) {
					System.out.println(BankMessage.MSG_WITHDRAW_FAIL);
					break;
				} else {
					bankAccount.setMoney(bankAccount.getMoney() - money);
					System.out.println(bankAccount.moneyToString(money) + " 송금합니다.");
				}
				for (BankAccount cBankAccount : BankAccounts) {
					if (cBankAccount.getAccountID().equals(sender) == true) {
						cBankAccount.setMoney(cBankAccount.getMoney() + money);
					}
				}
			}
		}

	}

}
