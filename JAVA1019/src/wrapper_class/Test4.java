package wrapper_class;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * char 타입 배열(chArr)에 'A', 'b', '5', '공백', '#' 문자 5개를 저장
		 * => 반복문을 활용하여 각각의 문자에 대한 판별 수행하여 결과 출력
		 * 	  (대문자, 소문자, 숫자, 기타문자)
		 */

		// chArr 배열 선언 및 초기화
		char[] chArr = {'A','b','5',' ', '#'};
		
		// for문과 if문을 통해 결과를 출력
		for(int i=0; i< chArr.length ; i++) {
			if(Character.isUpperCase(chArr[i])) {
				System.out.println(chArr[i] + " : 대문자!");
				
			}else if(Character.isLowerCase(chArr[i])) {
				System.out.println(chArr[i] + " : 소문자!");
				
			}else if(Character.isDigit(chArr[i])) {
				System.out.println(chArr[i] + " : 숫자!");
				
			}else if(Character.isWhitespace(chArr[i])) {
				System.out.println(chArr[i] + " : 공백!");
				
			}else {
				System.out.println(chArr[i]  + " : 기타문자!");
				
			}
		}
	}

}
