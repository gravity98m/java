package String;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * StringBuffer 와 StringBuilder
		 * - String 클래스는 한 번 생성되면 그 내부의 문자열이 변경되지 않음.
		 * - String 클래스를 사용하여 문자열을 계속 연결하거나 변경하는 프로그램을 사용하면
		 *   메모리 낭비가 심함
		 * - 이 때 StringBuffer 또는 StringBulier 를 활용하여 문자열을 변경하거나 연결.
		 * - 두 클래스는 크게 차이가 없으며
		 *   스레드가 동작하는 멀티스레드 프로그램이라면 문자열의 안전한 경을 보장하는 
		 *   StringBuffer 클래스를 사용하고,
		 *   스레드가 동작하지 않는 프로그램이라면 실행속도가 좀 더 빠른
		 *   StringBuilder 클래스를 사용.
		 */

		String str = new String("Java");
//		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
//		// => 인스턴스가 처음 생성될 때의 메모리 주소 : 41903949
//		System.out.println(str);
//		
//		str = str + " and";
//		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
//		// => 변경된 후 메모리 주소 : 488970385
//		System.out.println(str); // Java and
//		// => "Java and"의 문자열을 갖는 메모리 영역이 새로 생성되었음을 알 수 있음.
//		// => 기존의 "Java" 문자열을 갖는 메모리 영영은 참조하는 변수가 없을 경우
//		//    자바에서 제공하는 가비지 컬렉터에 의해서 자동으로 사라짐
//		
//		str = str + " android";
//		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
//		
//		str = str + " programming is fun!!";
//		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
		
		System.out.println("-----------------------------------------------------");

		StringBuilder buffer = new StringBuilder(str);
		// => String으로 부터 StringBuilder 생성
		System.out.println("연산 전 buffer 메모리 주소 " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		System.out.println("연산 후 buffer 메모리 주소 " + System.identityHashCode(buffer));
		buffer.append(" android");
		System.out.println("연산 후 buffer 메모리 주소 " + System.identityHashCode(buffer));
		buffer.append(" programming is fun!!");
		System.out.println("연산 후 buffer 메모리 주소 " + System.identityHashCode(buffer));
		
		System.out.println(buffer);
		
		// toString() 을 통해 String 클래스로 변환
		str = buffer.toString();
		System.out.println(str); 
		
		System.out.println("새로 만들어진 str 문자열 주소 " + System.identityHashCode(str));
		
		
		
		
		
		
	}

}
