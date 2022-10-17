package wrapper_class;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스의 다양한 메서드
		 * - 기본 데이터타입들을 다양하게 처리하기 위한 메서드가 제공됨
		 * - 주로 static 메서드 형태로 호출하여 사용
		 *   (클래스명.메서드명() 형태로 호출
		 * - 기본 데이터타입과 Wrapper 클래스 객체 모두 활용 가능
		 * 
		 */

		int num1 = 10, num2 = 20;
		Integer n1 = 10, n2 = 20;
		
		// max() : 두 정수의 최대값을 계산하는 메서드
		System.out.println(Integer.max(num1, num2)); // 기본데이터타입과
		System.out.println(Integer.max(n1, n2)); // Wrapper 클래스타입 모두 사용
		
		// min() : 두 정수의 최소값을 계산하는 메서드
		System.out.println(Integer.min(num1, num2));
		
		
	}

}
