package continue_break_statement;

public class Ex2 {

	public static void main(String[] args) {
		// 중첩 for문을 사용하여 구구단 2단 ~ 9단 출력
		// => 단, 구구단의 단이 5단일 때 반복문 종료
		for(int dan = 2; dan <= 9; dan++) { // 2단 ~ 9단 반복
			System.out.println(" < "+ dan + "단 >");
			
//			// 현재 단이 5단일 때 반복문 종료
//			if(dan == 5) {
//				break;
//			}
			
			
			for(int i = 1; i <= 9; i++) { // 1 ~ 9 반복
				if(dan == 5) {
					// 현재 단이 5단일 때 반복문 종료하는 것이 아니라
					// 안쪽 for문을 빠져나가고 바깥쪽 for문의 다음 반복 진행
					break;
				}
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
			} // 안쪽 for문 끝
			
			System.out.println();
		} // 바깥쪽 for문 끝

	}

}
