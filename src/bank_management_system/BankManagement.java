package bank_management_system;

import java.util.*;

public class BankManagement {
	public Scanner scan = new Scanner(System.in);
	ArrayList<BankAccount> list = new ArrayList<BankAccount>();

	public void printMenu() {
		int number = 0;

		while (true) {
			System.out.print("1.계좌 생성\n2.계좌 목록 보기\n3.입금\n4.출금\n5.계좌 잔액 확인\n6.송금 \n0.종료\n입력: ");
			number = check_Number();

			if (number == 1)
				createAccount();
			else if (number == 2)
				printList();
			else if (number == 3)
				depositMoney();
			else if (number == 4)
				withdrawMoney();
			else if (number == 5)
				printMyAccount();
			else if (number == 6)
				remitMoney();
			else if (number == 0)
				break;
		}
	}

	public int check_Number() {
		int number = 0;

		while (true) {
			try {
				number = scan.nextInt();
				if (number < 0)
					throw new Exception();
				break;
			} catch (InputMismatchException e) {
				System.out.println("정수 값을 입력하세요!!");
				scan.next();
			} catch (Exception e) {
				System.out.println("양수 값을 입력하세요!!");
				continue;
			}
		}

		return number;
	}

	public void createAccount() {
		String name, account;
		Random rand = new Random();

		System.out.print("생성할 계좌의 예금주: ");
		name = scan.next();
		account = (rand.nextInt(100) + 1) + "-" + (rand.nextInt(1000) + 1);
		list.add(new BankAccount(name, account, 0));
		System.out.println("계좌 생성이 완료되었습니다!!");
	}

	public void printList() {

		System.out.println("저장된 계좌의 정보를 출력합니다!!");
		for (BankAccount p : list) {
			System.out.println("계좌 " + p.getAccount() + "( 예금주 : " + p.getName() + " )");
			System.out.println("잔엑 : " + p.moneyToString());
		}
	}

	public void depositMoney() {
		String name;
		int money = 0;

		System.out.println("입금할 계좌의 예금주 입력 ");
		name = scan.next();

		for (BankAccount p : list) {
			if (p.getName().equals(name) == true) {
				System.out.println("잔엑 : " + p.moneyToString());
				System.out.print("입금할 금액 입력 : ");
				money = check_Number();
				p.setMoney(p.getMoney() + money);
				System.out.println(p.moneyToString(money) + " 입금합니다.");
			}
		}

	}

	public void withdrawMoney() {
		String name;
		int money = 0;

		System.out.println("출금할 계좌의 예금주 입력  ");
		name = scan.next();

		for (BankAccount p : list) {
			if (p.getName().equals(name) == true) {
				System.out.println("잔엑 : " + p.moneyToString());
				System.out.print("출금할 금액 입력 : ");
				money = check_Number();
				if (money > p.getMoney()) {
					System.out.println("출금할 금액이 계좌의 금액 보다 더 많습니다!!");
				} else {
					p.setMoney(p.getMoney() - money);
					System.out.println(p.moneyToString(money) + " 출금합니다.");
				}
			}
		}
	}

	public void printMyAccount() {
		String name;

		System.out.println("확인할 계좌의 예금주 입력  ");
		name = scan.next();

		for (BankAccount p : list) {
			if (p.getName().equals(name) == true) {
				System.out.println("계좌 " + p.getAccount() + "( 예금주 : " + p.getName() + " )");
				System.out.println("잔엑 : " + p.moneyToString());
			}
		}
	}

	public void remitMoney() {

		int money = 0;
		String owner, sender;
		System.out.println("송금할 사람의 이름을 입력 ");
		owner = scan.next();
		System.out.println("돈을 보낼 사람의 계좌를 입력 ");
		sender = scan.next();

		for (BankAccount p : list) {
			if (p.getName().equals(owner) == true) {
				System.out.println("송금할 금액 입력 ");
				money = check_Number();
				System.out.println("잔엑 : " + p.moneyToString());
				if (money > p.getMoney()) {
					System.out.println("송금할 금액이 계좌의 금액 보다 더 많습니다!!\n송금실패!!");
					break;
				} else {
					p.setMoney(p.getMoney() - money);
					System.out.println(p.moneyToString(money) + " 송금합니다.");
				}
				for (BankAccount pl : list) {
					if (pl.getAccount().equals(sender) == true) {
						pl.setMoney(pl.getMoney() + money);
						System.out.println(pl.moneyToString(money) + "이 입금되었습니다.");
					}
				}
			}
		}

	}

}
