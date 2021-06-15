package bank_management_system;

public class BankMessage {
	public static final String MSG_SELECT_MENU = "1.계좌 생성\n2.계좌 목록 보기\n3.입금\n4.출금\n5.계좌 잔액 확인\n6.송금 \n0.종료\n입력: ";
	public static final String MSG_CREATE_SUCCESS = "계좌 생성이 완료되었습니다!!";
	public static final String MSG_INPUT_INTEGER_FAIL = "정수 값을 입력하세요!!";
	public static final String MSG_INPUT_POSITIVE_NUMBER_FAIL = "양수 값을 입력하세요!!";
	public static final String MSG_INPUT_NAME = "생성할 계좌의 예금주: ";
	public static final String MSG_WITHDRAW_FAIL = "출금할 금액이 계좌의 금액 보다 더 많습니다!!";
}
