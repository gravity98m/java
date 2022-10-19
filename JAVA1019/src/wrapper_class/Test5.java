package wrapper_class;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		/*
		 * 문자열을 char[] 배열에 분리하여 저장 후
		 * 해당 문자열에 대한 간단한 암호화 작업
		 * - 문자열을 분리하여 저장한 배열을 encrypt()에 전달
		 * - 전달받은 배열의 문자에 대해 아스키코드 값 3만큼 증가한 문자를
		 *   별도의 배열에 저장한 후 문자열로 변환하여 리턴
		 *   ex) 'A'(65) => 'D'(68)
		 *   ex) "Hello" -> 'H', 'e', 'l', 'l', 'o' 형태로 배열에 저장됨
		 *        암호화 작업 결과물 : 'K', 'h', 'o', 'o', 'r'
		 *        리턴되는 데이터 : "Khoor"
		 */
		
//		char[] chArr = { 'a', 'd', 'm', 'i', 'n' , '1', '2', '3'};
		String str = "admin123";
//		String str = "itwill";
		
		// String 타입 문자열을 char타입 배열로 변환 : toCharArray() 사용
		char[] chArr = str.toCharArray();

		//		String s = "Hello";
//		char[] chArr = s.toCharArray();
		

		String encryptResult = encrypt(chArr);

		System.out.println("암호화 전 : " + Arrays.toString(chArr));
		System.out.println("암호화 후 : " + encryptResult);
	}			
	    // enrypt() 메서드
		private static String encrypt(char[] chArr) {
			// 암호화 작업 수행
			// => 전달받은 배열 내의 모든 문자 값을 +3을 수행하여 새 배열에 저장 후
			//	 문자열로 결합하여 리턴
			// => 전달받은 배열의 크기를 새 배열의 크기로 지정
			//	 Hint) new 키워드를 사용, 배열의 크기는 기존 배열의 개수
			char[] encryptedArr = new char[chArr.length];
			
			
			for(int i = 0; i < chArr.length; i++) {
				// 각 배열의 문자 +3 수행한 결과를 새 배열에 저장
				encryptedArr[i] = (char)(chArr[i] + 3);
			}
			
			// 배열 내의 모든 문자를 문자열로 결합하여 리턴
			// => Arrays 클래스의 toString() 메서드 활용
//			return Arrays.toString(encryptedArr);
			
			// 1. String 생성자 활용
//			String str = new String(encryptedArr);
//			return str;
			
			// 2. String.valueOf() 메서드 활용
//			String str = String.valueOf(encryptedArr);
//			return str;
			
			// 3. StringBuilder 활용
			StringBuilder buffer = new StringBuilder();
			for(char ch : encryptedArr) {
				buffer.append(ch);
			}
			String encryptedStr = buffer.toString();
			return encryptedStr;
		}
		


}
