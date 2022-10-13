package object;

import java.util.Objects;

public class Test2 {
	public static void main(String[] args) {
		// acc와 acc2 생성 후 두 계좌의 정보 비교 및
		// 참조 변수 출력 시 toString() 메서드 활용
		
		Account acc = new Account("110-111-1111", "홍길동", 10000);
		System.out.println("acc 계좌정보 :" + acc); // acc.toString()

		Account acc2 = new Account("110-111-1111", "홍길동", 10000);
		System.out.println("acc2 계좌 :" + acc2); // acc2.toString()
		
		if(acc.equals(acc2)) {
			System.out.println("두 계좌는 동일한 계좌입니다!");
		}else {
			System.out.println("두 계좌는 다른 계좌입니다!");
		}
		
	}
}

/*
 * Account 클래스 정의
 * - 멤버변수
 *   계좌번호(accountNo, 문자열), 예금주명(ownerName, 문자열)
 *   현재잔고(balance, 정수)
 *   
 * - 생성자 : 계좌번호, 예금주명, 현재잔고를 전달받아 초기화
 * - equals() 메서드 오버라이딩하여 계좌정보를 비교하도록 정의
 * - toString() 메서드 오버라이딩하여 계좌정보를 문자열로 리턴하도록 정의
 * 
*/

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNo, other.accountNo) && balance == other.balance
				&& Objects.equals(ownerName, other.ownerName);
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
}