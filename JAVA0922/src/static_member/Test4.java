package static_member;

public class Test4 {

	public static void main(String[] args) {
//		Account acc = new Account();
		// 생성된 인스턴스를 리턴받기
		Account acc = Account.getInstance();
		
		// Setter 호출하여 계좌번호 저장, showAccountInfo() 메서드로 출력
		acc.setAccounNo("111-1111-111");
		acc.showAccountInfo();
	}

}

class Account{
	// ===========================Account 클래스에 대한 싱글톤 패턴 구현=====================
	private static Account instance = new Account();
	
	private Account() {}
	
	public static Account getInstance() {
		return instance;
	}
	
	// =======================================================================================
	
	// accountNo 멤버변수 선언(String, Private)
	private String accounNo;

	
	// Getter/Setter 메서드 정의
		public String getAccounNo() {
				return accounNo;
			}
	
		public void setAccounNo(String accounNo) {
				this.accounNo = accounNo;
			}


		// showAccountInfo() 메서드 정의
		public void showAccountInfo() {
			System.out.println("계좌번호 : " + accounNo);
		}
		
}