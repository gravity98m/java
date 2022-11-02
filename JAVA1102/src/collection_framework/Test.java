package collection_framework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		/*
		 * Set 계열 객체를 활용하여 로또 번호 생성기 작성
		 * 1. Set 타입 객체 myLotto 생성
		 * 2. 1 ~ 45 사이의 중복되지 않는 난수(로또번호) 6개를 Set 객체에 저장
		 * 	  => ex) "나의 로또 번호 : 1 10 11 15 23 41 44" 출력
		 * --------------------------------------------------------------------
		 * 3. 이번주 로또 1등 당첨 번호를 Set 객체 thisWeekLotto에 저장
		 *    => ex) "이번주 1등 당첨번호 : 7 8 11 13 15 23" 출력
		 * 4. 기존의 myLotto에 저장된 번호와 1등 당첨번호를 비교하여
		 *    일치하는 번호 개수와 등수 출력
		 *    => ex) 번호가 3개(11 13 23) 일치 시
		 *    		"일치하는 번호 개수 : 3개(4등)"
		 *    => 6개 일치 : 1등, 5개 : 2등, 4개 : 3등, 3개 : 4등, 나머지 : 꽝
		 */

		// Set 객체(myLotto, thisWeekLotto) 생성
		// => 만약, 정렬까지 수행하려면 TreeSet 객체 생성
		// => 제네릭 타입은 Integer으로 지정
		// thisWeekLotto 생성
//		Set<Integer> thisWeekLotto = new TreeSet<Integer>();
//		thisWeekLotto.add(7);
//		thisWeekLotto.add(8);
//		thisWeekLotto.add(11);
//		thisWeekLotto.add(13);
//		thisWeekLotto.add(15);
//		thisWeekLotto.add(23);
//		thisWeekLotto.add(23,5); // 한 번에 값 하나만 가능. Arrays.asList()를 사용하면 여러 개의 값을 저장 가능
		
		Set<Integer> thisWeekLotto = new TreeSet<Integer>(Arrays.asList(7, 8, 11, 13, 15, 23));
		
		System.out.println("이번주 1등 당첨번호 : " + thisWeekLotto);
		
		// myLotto 생성
		Set<Integer> myLotto = new TreeSet<Integer>();
		
		// 1 ~ 45 사이의 난수(로또번호) 6개를 중복되지 않는 범위에서 저장
		// 반복문(for, while)을 사용해서 6개의 난수를 발생
		// while 문을 사용
		// hint) 1) while문의 조건문이 true일 동안 계속 반복
		//		 2)	조건문 : myLotto 내의 난수가 6개가 넘어가거나 6개이면 반복을 종료
		// 					(6개가 되지 않는 동안 계속 반복)
		Random r = new Random();
		while (myLotto.size() < 6) { // myLotto.size() != 6
			myLotto.add(r.nextInt(45) +1);
		}
		
//		while(true) {
//			if(myLotto.size() == 6) {
//				break;
//			}
//			myLotto.add(r.nextInt(45) +1);
//		}
		
//		for(int i = 1; i <= 6; i++) {
//			int rNum = r.nextInt(45) +1;
//			// Math.random()  * 45 + 1;
//			if(myLotto.contains(rNum)) { // 조건식이 true이면 숫자 중복!
//				System.out.println("중복되는 번호 발생! - " + rNum);
//				// 중복 번호가 발생했으므로 카운팅을 하지 않도록 i를 1감소
//				i--;
//			}else {
//				myLotto.add(rNum);
//			}
//			
////			if(!myLotto.add(rNum)) { // 중복으로 false가 리턴되면 !(NOT) 연산자로 true로 변경
////				System.out.println("중복되는 번호 발생! - " + rNum);
////				// 중복 번호가 발생했으므로 카운팅을 하지 않도록 i를 1감소
////				i--;
////			}
//		}
		
		System.out.println("나의 로또 번호 : " + myLotto);

		// =================================================================
		// 당첨번호와 일치하는 개수 카운팅
		int count = 0; // 카운팅 결과를 저장할 변수
		// 1. 향상된 for문 사용 시
		for(int num : myLotto) { // 나의 로또 번호에서 번호 1개씩 꺼내서 num에 대입
			if(thisWeekLotto.contains(num)){
				count++;
			}
			
		}
		
		// 2. Iterator 사용 시
		Iterator<Integer> ite = myLotto.iterator();
		while(ite.hasNext()) {
			int num = ite.next();
			
		}
		System.out.println(count);
		
		switch (count) {
			case 6 : System.out.println("1등"); break;
			case 5 : System.out.println("2등"); break;
			case 4 : System.out.println("3등"); break;
			case 3 : System.out.println("4등"); break;
			default : System.out.println("꽝");
		}
		
	}

}
