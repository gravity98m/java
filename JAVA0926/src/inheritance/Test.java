package inheritance;

public class Test {

	public static void main(String[] args) {

//		Account acc = new Account();
//		acc.accountNo = "111-1111-111";
//		acc.ownerName ="홍길동";
//		acc.balance = 10000;
//		
//		acc.showAccountInfo();
//		System.out.println("--------------------------------");
//		acc.withdraw(100000);

		ItwillBank ib = new ItwillBank();
		
		// Account 로 부터 상속받은 기본 멤버 접근
		ib.accountNo = "222-2222-222";
		ib.ownerName = "이순신";
		ib.balance = 100000;
		ib.showAccountInfo();
		
		System.out.println("---------------------------------------");
		ib.deposit(10000);
		
		System.out.println("---------------------------------------");
		int money = ib.withdraw(200000);
		
		System.out.println("출금된 금액 : " + money);
		
		System.out.println("---------------------------------------");
		ib.contract("아이티윌 보험");
	}

}

/*
* Account 클래스를 상속받는 ItwillBank 클래스 정의
* - Account의 기본기능(계좌의 기본기능)은 그대로 유지
*   => 계좌번호(accountNo), 예금주명(ownerName), 현재잔고(balance) 멤버변수
*   => 입금하기(deposit), 출금하기(withdraw), 정보보기(showAccountInfo) 메서드
* - 멤버변수 추가 : 보험명(insureName, 문자열)
* - 메서드 추가 : 보험계약(contract())
*   => 파라미터 : 보험명
*      리턴값 : 없음
*   => 전달받은 보험명을 멤버번수에 저장 후 "XXX 보험 계약 완료!" 출력
*/

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	// 정보보기
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	// 입금기능
	public void deposit(int money) {
		balance += money;
		System.out.println("입금하신 금액 : " + money + "원");
		// System.out.println("입금 후 현재잔고 : " + balance + "원");
		showAccountInfo();
	}
	
	// 출금기능
	public int withdraw(int money) {
		if(balance < money) { // 현재잔고가 출금금액보다 적은 판별(출금불가)
			System.out.println("잔고가 부족하여 출금이 불가능합니다.");
			System.out.println("출금할 금액 : " + money +"원, 현재잔고 : " + balance + "원");
			money = 0; // 받은 money은 인출할 수 없는 값이므로 0으로 초기화해주는 과정
		}   
			// 출금 확인 정보출력(가능한 금액이든 아니든 결과를 출력할 필요가 있음)
		    balance -= money;
		    System.out.println("출금하신 금액    : " + money + "원");
		    System.out.println("출금 후 현재잔고 : " + balance + "원");
		    
		    return money;  // 출금금액 리턴
		    
	}
	
}


class ItwillBank extends Account{
	String insureName;
	
	public void contract(String insureName) {
		this.insureName = insureName;
		System.out.println(ownerName + " 고객님 " + insureName + " 보험 계약 완료!");
	}
}