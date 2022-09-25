package constructor;

public class Test {

	public static void main(String[] args) {
		// 은행계좌(Account) 클래스의 인스턴스(acc) 생성
		Account acc = new Account();
//		System.out.println(acc.accountNo); // 클래스 외부에서는 '변수명.멤버변수' 형태로 호출해야 함 
		
		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예금주명 : " + acc.ownerName);
		System.out.println("현재잔고 : " + acc.balance + "원");
		
		acc.accountNo = "333-3333-333";
		acc.ownerName = "이순신";
		acc.balance = 10000;
		
		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예금주명 : " + acc.ownerName);
		System.out.println("현재잔고 : " + acc.balance + "원");
		
		acc.showAccountInfo();

	}

}

class Account {
	// 멤버변수 선언(= 필드)
	String accountNo;
	String ownerName;
	int balance;
	
//	public Account() {} // 기본 생성자
	
	// 생성자 정의
	public Account() {
		System.out.println("Account() 생성자 호출됨!");
		
		// 인스턴스 생성 시 기본값으로 가져야 할 데이터를 멤버변수 저장
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
	}
	
	// 메서드 정의
	// 계좌 정보를 출력하는 showAccountInfo() 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
}