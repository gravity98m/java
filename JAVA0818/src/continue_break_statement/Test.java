package continue_break_statement;

public class Test {

	public static void main(String[] args) {
		/*
		 * 1 ~ 100까지 정수의 합을 계산(total 변수에 저장)
		 * => 단, 합계가 1000 보다 클 경우 반복문을 종료하고 빠져나간 뒤
		 *    1000보다 커지는 시점의 정수(x)를 출력
		 */
		int total = 0;
		int x;
		
		for(x = 1; x <= 100; x++) {
			total += x;
			
			if(total > 1000) {
				break; // 합계(total) 가 1000보다 클 때 for문 종료
			}
		}
		
		System.out.println("1 ~ " + x + "까지 정수의 합 = " + total);
		System.out.println("합계가 1000보다 클 때 x = " + x);
		
		/*
		 * 1 + (-2) + 3 + (-4) + 5 + (-6) + ...생략... 형식으로 계속 더할 때
		 * 총합이 100 이상이 되는 x 값을 출력(break문 사용)
		 * <힌트> 정수가 짝수일 때는 음수 형태로 변환하여 합계 누적
		 */
//		x = 1;
//		total = 0;
//		
//		while(true) { // 계속 반복
//			if(x % 2 == 0) { // 짝수일 때
//				System.out.println(-x);
//				total = total + -x; // 음수값으로 변환하여 누적
//			} else { //홀수일 때
//				System.out.println(x);
//				total += x; // 양수값 그대로 누적
//			}
//			
//			if(total >= 100) {
//				break;
//			}
//			
//			x++;
//		}
		
		x = 0;
		total = 0;
		
		while(total < 100) { // 합계가 100보다 작을 동안 반복(= 100이상 종료)
			x++;
			if(x % 2 == 0) { // 짝수일 때
				System.out.println(-x);
				total = total + -x; // 음수값으로 변환하여 누적
			} else { //홀수일 때
				System.out.println(x);
				total += x; // 양수값 그대로 누적
			}
		}
		
		System.out.println();
		System.out.println("x = " + x);
		System.out.println("total = " + total);
		
		

	}

}







