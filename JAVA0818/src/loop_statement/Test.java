package loop_statement;

public class Test {

	public static void main(String[] args) {
		// while 문을 사용하여 구구단 2단 출력
		int dan = 2;
		System.out.println("< " + dan + "단 >");
		
		int i = 1;
		while(i <= 9) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++;
		}
		
		System.out.println("=============================");
		
		// while 문을 사용하여 정수 1 ~ 10 까지의 합(total)을 계산 후 출력
		
		// 누적변수 total 선언 및 초기화
		int total = 0;
		
		int num = 1; // 초기식
		
		while(num <= 10) { // 조건식
			total += num; //total에 누적
			num++; // 증감식
		}
		
		// total 출력
		System.out.println("1 ~ 10까지 정수의 합 = " + total);

	}

}







