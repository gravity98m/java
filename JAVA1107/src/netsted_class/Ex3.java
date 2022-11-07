package netsted_class;

import java.security.PublicKey;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 익명(annoymous) 객체
		 * - 이름이 없는 객체
		 * - 클래스 선언과 객체의 생성을 동시에 하기 때문에 단 한번만 사용될 수 있고
		 *   오직 하나의 객체만을 생성할 수 있는 일회용 클래스
		 * - 이름이 없기 때문에 생성자도 가질 수 없다.
		 * - 부모클래스의 이름이나 구현하고자 하는 인터페이스의 이름을 사용해서 정의하므로 
		 *   하나의 클래스로 상속받는 동시에 인터페이스를 구현하거나
		 *   하나 이상의 인터페이스를 구현할 수 없다.
		 * - 단 하나의 클래스를 상속받거나 단 하나의 인터페이스만을 구현할 수 있다
		 * 
		 * < 익명 객체 문법 >
		 *  new 슈퍼클래스이름() {
		 *   	// 멤버 선언
		 *  };
		 *  
		 *  또는
		 *  
		 *  new 구현인터페이스이름() {
		 *  	// 멤버 선언
		 *  };
		 */

		Parent p = new Child(); // 업캐스팅
		p.wake();
		
		Child c = new Child();
		c.method2(p);
		c.method2(new Child2());
		
		System.out.println("-------------------------------------------------------");
		
//		Child2 c2 = new Child2();
////		c.method2(new Child2());
//		c.method2(c2);
//		// => 매개변수의 타입이 Parent 이므로 Parent 타입 p 또는
//		//    서브 클래스인 Child, Child2 객체를 파라미터 값으로 활용 가능
		
		System.out.println("-------------------------------------------------------");
		
		AnnonymousClass annoy = new AnnonymousClass();
		// => 익명의 클래스를 활용하기 위해 AnnoymousClass의 인스턴스 생성
		annoy.p.wake(); // Child 클래스를 따로 두지 않아서 heap 메모리에 남지 않음
		// => 익명 클래스 생성 및 메서드 호출
		
		System.out.println();
		
		Parent parent = annoy.p; // p는 Parent 타입이므로 Parent 타입 변수
		parent.wake();
		
		System.out.println();
		
		System.out.println("======================================");
		
//		C c = new C();
		// => 지역 내부 클래스는 객체를 바로 생성할 수 없음!
		// => 즉, C 클래스를 사용하려면 클래스를 직접 생성하는 것이 아니라
		//    method1() 메서드 호출을 통해 생성된 객체를 리턴(반환) 받아야 함
		Parent parent2 = annoy.method1(); // 리턴 타입이 Parent 이므로 Parent 타입 변수
		parent2.wake();
		
		System.out.println();
		
		Parent parent3 = annoy.annoyMethod1();
		parent3.wake();
		
		System.out.println("====================================");
		Child2 c2 = new Child2();
//		c.method2(new Child2());
		c.method2(c2);
		// => 매개변수의 타입이 Parent 이므로 Parent 타입 p 또는
		//    서브 클래스인 Child, Child2 객체를 파라미터 값으로 활용 가능
		annoy.method2(
				new Parent() {
					public void study() {
						System.out.println("공부합니다!");
					}
					@Override
					public void wake() {
						System.out.println("4시에 일어납니다!");
						study();
					}
				}
				);
		
		System.out.println("================================================");
		// =============================================================================
		// 인터페이스 익명 객체 활용
//		I i = new I();
		// => 인터페이스는 생성자가 요소에 없어서 인스턴스를 만들 수 없다!
		
		I i = new I() {
			@Override
			public void wake() {
				System.out.println("9시에 일어납니다!");
			}
		};
		
		i.wake();
		
		
		
	}
}

class Parent {
	public void wake() {
		System.out.println("7시에 일어납니다!");
	}
}

class Child extends Parent {
	public void work() {
		System.out.println("출근합니다!");
	}

	@Override
	public void wake() {
		System.out.println("6시에 일어납니다!");
		work();
	}
	
	public void method2(Parent p) {
		p.wake();
	}
}

class Child2 extends Parent {
	public void study() {
		System.out.println("공부합니다!");
	}

	@Override
	public void wake() {
		System.out.println("4시에 일어납니다!");
		study();
	}
}

// 익명 객체 활용
class AnnonymousClass {
	// AnnoymousClass 클래스의 필드 선언
	Parent p = new Parent() {
		public void work() {
			System.out.println("출근합니다!");
		}
		
		public void wake() {
			System.out.println("6시에 일어납니다!");
			work();
		}
	};
	
	// AnnoymousClass 클래스의 인스턴스 메서드에서의 익명 클래스 활용
	// 지역 내부 클래스 사용
	public Parent method1() { // 메서드의 리턴타입이 Parent
		class C extends Parent{ // Parent 타입의 객체를 반환하기 위해 메서드 내부에 클래스 정의
								// Parent 클래스를 상속받는 C 클래스 정의
			public void walk() {
				System.out.println("강아지와 함께 산책합니다!");
			}
			
			public void wake() {
				System.out.println("5시에 일어납니다!");
				walk();
			}
		}
		return new C(); // C 클래스를 선언하고 리턴(반환) 함
	}
	// =>  위의 지역 내부 클래스를 익명 내부 클래스로 변경하면 아래와 같음!
	
	public Parent annoyMethod1() {
		return new Parent() {
			public void walk() {
				System.out.println("고양이와 함께 산책합니다!");
			}
			
			@Override
			public void wake() {
				System.out.println("5시에 일어납니다!");
				walk();
			}
		};
	}
	
	public void method2(Parent p) {
		p.wake();
	}
	
}

// =================================================================================
// 인터페이스 익명 객체
interface I {
	public abstract void wake();
}