package super_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * < 상속에서의 생성자 >
		 * - 생성자는 상속되지 않음
		 * 	 => 생성자 이름은 자신의 클래스 이름과 동일한데
		 *  	만약, 상속받을 경우 생성자 이름이 부모 클래스 이름이므로 생성자 작성 규칙에 위배됨
		 * - 서브클래스의 인스턴스 생성할 때는, 자동으로 슈퍼클랫의 인스터스를 먼저 생성한 후 서브클래스의 인스턴스가 생성됨
		 * 	 => 이때, 서브클래스 생성자에서 슈퍼클래스의 기본생성자를 자동 호출
		 * 	 => 만약, 슈퍼클래스에 파라미터 생성자만 존재할 경우, 서브클래스 생성자에서 컴파일 에러가 발생하게 된다!
		 * 
		 * < 생성자 super() >
		 * - 슈퍼클래스의 생성자를 명시적으로 호출할 때 사용.
		 * 	 => 생성자 this()와 사용방법 및 목적은 동일함
		 * - 기본 문법 : super([데이터...]);
		 * - 목적1) 슈퍼클래스 생성자 중 특정 생성자를 명시적으로 호출할 경우
		 * 			ex) 슈퍼클래스에 기본 생성자없이 파라미터 생성자만 정의 시
		 * 				서브클래스 생성자에서 슈퍼클래스 기본 생성자 호출 불가로 컴파일 에러가 발생하는데, 
		 * 				이 때 슈퍼클래스의 파라미터 생성자를 명시적으로 호출하기 위해 사용
		 *   목적2) 슈퍼클래스 생성자에 멤버변수 초기화 코드가 존재할 경우
		 *   		ex) 서브클래스 생성자에서 슈퍼클래스의 멤버까지 초기화하면 초기화 코드의 중복이 발생하게 됨!
		 *   			이 때, 슈퍼클래스의 멤버는 슈퍼클래스의 생성자에서, 서브클래스의 멤버는 서브클래스의 생성자에서 초기화하여 코드 중복을 제거하기 위해 사용
		 *   
		 * - 주의! 생성자 super()는 반드시 생성자의 첫 문장에서 실행되어야 함
		 * 	 => 따라서, 생성자 내에는 super()와 this() 동시 사용 불가
		 */
	}

}

class Person{	// class Person extends Object
	String name;
	int age;
	
	public Person() {} // 기본생성자
	
	// 파라미터 생성자 단축키 : alt shift s -> o
	public Person(String name, int age) {
		super();	// Object 클래스의 Object() 기본생성자 호출
		this.name = name;
		this.age = age;
		System.out.println("Person(String, int) 생성자 호출됨!");
	}
}

class Student extends Person{ //Implicit super constructor Person() is undefined for default constructor. Must define an explicit constructor
	boolean isStudyMode;
	
	public Student() {
		// 서브클래스의 기본 생성자에서 슈퍼클래스인 Person 클래스의 기본생성자를 자동으로 호출되게 되는데
		// 만약, 슈퍼클래스 생성자가 파라미터 생성자만 존재할 경우 오류 발생!
//		super(); // 암묵적으로 생성자 내에 포함됨
		// => 그러므로,Person() 생성자 없이 파라미터 생성자만 있을 경우 오류!
		// 따라서, 슈퍼클래스에 기본 생성자를 별도로 정의하거나(1)
		// 서브클래스에서 슈퍼클래스의 파라미터 생성자를 명시적으로 호출(2)
		super("홍길동", 20); // 생성자는 반드시 첫 줄에 작성할 것
	}
	
	
}
