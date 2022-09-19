package constructor;

public class Test2 {

	public static void main(String[] args) {
		
		Account2 acc = new Account2("111-1111-111","홍길동", 10000);
		acc.showAccountInfo();
		
	}

}

class Account2 {
	String accountNo;
	String ownerName;
	int balance;
	
	// 계좌번호, 예금주명, 현재잔고를 전달받아 초기화하는 파라미터 생성자 정의
	public Account2(String newAccountNo, String newOwnerName, int newBalance) {
		accountNo = newAccountNo;
		ownerName = newOwnerName;
		balance = newBalance;
	}
	
	// 계좌정보를 출력하는 showAccountInfo() 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
}