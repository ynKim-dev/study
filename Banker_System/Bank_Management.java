package Banker_System;

import java.util.*;

public class Bank_Management {

	public Scanner scan = new Scanner(System.in);
	ArrayList<Bank_Account> list = new ArrayList<Bank_Account>();

	public void print_Menu() {
		int number = 0;

		while (true) {
			System.out.print("1.계좌 생성\n2.계좌 목록 보기\n3.입금\n4.출금\n5.계좌 잔액 확인\n0.종료\n입력: ");
			number = check_Number();

			if (number == 1)
				create_Account();
			else if (number == 2)
				print_List();
			else if (number == 3)
				deposit_Money();
			else if (number == 4)
				withdraw_Money();
			else if (number == 5)
				print_My_Account();
			else if (number == 0)
				break;
		}
	}

	public int check_Number() {
		int number = 0;

		while (true) {
			try {
				number = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("정수 값을 입력하세요!!");
				scan.next();
			}
		}

		return number;
	}

	public void create_Account() {
		String name, account;
		Random rand = new Random();

		System.out.print("생성할 계좌의 예금주: ");
		name = scan.next();
		account = (rand.nextInt(100) + 1) + "-" + (rand.nextInt(1000) + 1);
		list.add(new Bank_Account(name, account, 0));
		System.out.println("계좌 생성이 완료되었습니다!!");
	}

	public void print_List() {

		System.out.println("저장된 계좌의 정보를 출력합니다!!");
		for (Bank_Account p : list) {
			System.out.println("계좌 " + p.get_Account() + "( 예금주 : " + p.get_Name() + " )");
			System.out.println("잔엑 : " + p.money_To_String());
		}
	}

	public void deposit_Money() {
		String name;
		int money = 0;

		System.out.println("입금할 계좌의 예금주 입력 ");
		name = scan.next();

		for (Bank_Account p : list) {
			if (p.get_Name().equals(name) == true) {
				System.out.println("잔엑 : " + p.money_To_String());
				System.out.print("입금할 금액 입력 : ");
				money = check_Number();
				p.set_Money(p.get_Money() + money);
				System.out.println(p.money_To_String(money) + " 입금합니다.");
			}
		}

	}

	public void withdraw_Money() {
		String name;
		int money = 0;

		System.out.println("출금할 계좌의 예금주 입력  ");
		name = scan.next();

		for (Bank_Account p : list) {
			if (p.get_Name().equals(name) == true) {
				System.out.println("잔엑 : " + p.money_To_String());
				System.out.print("출금할 금액 입력 : ");
				money = check_Number();
				if (money > p.get_Money()) {
					System.out.println("출금할 금액이 계좌의 금액 보다 더 많습니다!!");
				} else {
					p.set_Money(p.get_Money() - money);
					System.out.println(p.money_To_String(money) + " 출금합니다.");
				}
			}
		}
	}

	public void print_My_Account() {
		String name;

		System.out.println("확인할 계좌의 예금주 입력  ");
		name = scan.next();

		for (Bank_Account p : list) {
			if (p.get_Name().equals(name) == true) {
				System.out.println("계좌 " + p.get_Account() + "( 예금주 : " + p.get_Name() + " )");
				System.out.println("잔엑 : " + p.money_To_String());
			}
		}
	}

}
