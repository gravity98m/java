package netsted_class;

import java.lang.reflect.Method;
import java.util.Random;

import netsted_class.Outer.Inner;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 중첩 클래스(Netsted Class)
		 * - 클래스 내에서 정의한 클래스
		 * - 독립적인 일반 클래스 형태로 작성할 필요는 없지만
		 *   나름대로 클래스 형태(멤버변수, 메서드, 생성자)를 갖춰야 할 때 사용
		 * - 보통, 자신의 클래스 내에서만 접근 가능하도록
		 *   전용 클래스로 정의할 때 사용
		 *   => 주로 GUI 구현 시 이벤트 처리를 위한 핸들러 클래스 정의 시 사용
		 * - 외부클래스(Outer Class)와 내부클래스(Inner Class)로 구분됨
		 * - 클래스 정의 위치에 따라 다음과 같이 구분됨
		 *   1) 인스턴스 멤버(내부) 클래스
		 *      - 멤버변수 및 메서드와 동일한 레벨에 정의한 클래스
		 *      - static 키워드를 지정하지 않은 클래스
		 *      - 반드시 외부클래스 인스턴스 생성 후 접근 가능
		 *      
		 *   2) 정적 멤버(내부) 클래스
		 *      - 멤버변수 및 메서드와 동일한 레벨에 정의한 클래스
		 *      - static 키워드를 지정한 클래스
		 *      - 외부클래스명만으로 접근 가능
		 *      
		 *   3) 로컬 멤버(내부) 클래스
		 *      - 클래스 내의 메서드 내에서 정의한 클래스
		 */
		
		// 1. 인스턴스 내부 클래스에 접근
		//    => 반드시 외부클래스의 인스턴스 생성 후 참조변수를 통해서
		//		 내부클래스에 접근해야 한다!
		
		Outer outer = new Outer();
		
		// 외부클래스를 통해 내부클래스의 인스턴스 생성할 경우
		// 반드시 외부클래스명.내부클래스명 타입으로 변수를 지정하고
		// 외부클래스참조변수명.new 내부클래스명() 형태로 인스턴스 생성
//		Inner inner = new Inner();
		// => 내부클래스의 인스턴스를 바로 생성할 수 없다!
		Outer.Inner inner = outer.new Inner();
		
		Inner inner2 = outer.new Inner();
		// => import netsted_class.Outer.Inner;
		
		java.util.Random r;
		
		inner.innerMethod();
		System.out.println(inner.innerNum);
		
		// ---------------------------------------------------------
		// 2. 정적 내부 클래스에 접근
		// => 정적 내부 클래스는 static 키워드가 적용되어 있으므로
		//    클래스가 메모리에 로딩될 때 정적 내부 클래스로 함께 로딩됨
		//    따라서, 내부클래스 접근 문법은 외부클래스 인스턴스 생성없이
		//    외부클래스명만으로 접근 가능
		// => 외부클래스명.내부클래스명 참조변수명 = new 외부클래스명.내부클래스명();
		Outer.StaticInner staticInner = new Outer.StaticInner();
		
		System.out.println(staticInner.innerNum);
		staticInner.innerMethod();
	}
}

class Outer { // 외부클래스
	private int num = 10; // 인스턴스 멤버변수
	int num2 = 20;
	static int num3 = 30; // 정적 멤버변수
	
	public void method() { // 인스턴스 멤버메서드
		// 인스턴스 멤버메서드 내에서는 인스턴스 멤버변수 및 메서드에 대해
		// 자유롭게 접근이 가능하다!
		System.out.println("인스턴스 멤버변수 num = " + num);
		
		method2();
		mehtod3();
	}
	
	public void method2() { // 인스턴스 멤버메서드
		System.out.println("인스턴스 메서드 method2()");
	}
	
	public static void mehtod3() { // 정적 멤버메서드
		// 정적 메서드 내에서는 인스턴스 멤버에 대한 접근 불가
//		System.out.println("인스턴스 멤버 변수 num = " + num); // 접근 불가
		// => Cannot make a static reference to the non-static field num
		
//		method(); // 접근 불가
		
		System.out.println("정적 멤버 변수 num3 = " + num3);// 접근 불가
		
	}
	
	// ------------------------------------------------------------------------
	// 인스턴스 멤버 내부클래스 정의
	class Inner {
		int innerNum = 100;
		// 인스턴스 멤버 내부 클래스에서는 외부클래스 멤버에 자유롭게 접근 가능
		// = 인스턴스 멤버 메서드에서의 접근 범위와 동일함
		
		// 주의사항!
//		static int innerNum2 = 200;
		// => The field innerNum2 cannot be declared static in a non-static inner type, 
		//    unless initialized with a constant expression
		// static 변수 선언할 수 없다!
		
		public void innerMethod() {
			System.out.println("외부클래스의 인스턴스 멤버변수 num = " + num);
			// => 외부클래스의 멤버변수에 접근 가능
//			method();
			method2();
//			mehtod3();
			// => 외부클래스의 멤버에서도 호출 가능
		}
	}
	
	// --------------------------------------------------------------------------------
	// 정적 멤버 내부클래스 정의
	static class StaticInner {
		int innerNum = 10;
		// 정적 멤버 내부클래스에서는 외부클랫의 인스턴스 멤버에 접근 불가!
		// => 메모리 로딩 시점이 다르기 때문(= 정적 메서도와 규칙 동일)
		
		static int innerStaticNum = 200;
		
		public void innerMethod() {
//			System.out.println("외부클래스의 인스턴스 멤버변수 num = " + num);
			// => 외부클래스의 멤버변수 접근 불가능
//			Method2(); // 외부클래스의 멤버메서드오 호출 불가능!
			System.out.println("외부클래스의 정적 멤버변수 num3 = " + num3);
		}
		
		public static void innerStticMethod() {
//			System.out.println("내부클래스의 인스턴스 멤버변수 innerNum = " + innerNum);
			// => static 선언이 없는 innerNum 에는 접근 불가능!
			System.out.println("내부클래스의 정적 멤버변수 num3 = " + num3);
		}
	}
	
	
}

