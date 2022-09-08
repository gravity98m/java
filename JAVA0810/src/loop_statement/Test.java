package loop_statement;

public class Test {

	public static void main(String[] args) {
		// 1 ~ 9까지 1씩 증가하면서 출력
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
		
		// for문으로 표현
//		for(int i = 1; i < 10; i++) {
//			System.out.println(i);
//		}
		
		// ==============================================================
		/*
		 * for문을 사용하여 특정 단에 해당하는 구구단 출력
		 *   < 2단 >
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * 2 * 5 = 10
		 * 2 * 6 = 12
		 * 2 * 7 = 14
		 * 2 * 8 = 16
		 * 2 * 9 = 18 
		 */
//		System.out.println(" < 2단 >");
//		System.out.println("2 * 1 = 2");
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18");
		
		
		
		// 단(dan)과 곱해지는 수(i) 를 저장할 변수를 선언하고 값을 저장하면
		// 단이 바뀌더라도 대응이 가능하다!
		int dan = 2;
		int i = 1;
		
		System.out.println(" < "+ dan + "단 >");
//		System.out.printf(" < %d단 >", dan);
		
		System.out.println(dan + " * " + i + " = " + (dan*i)); // dan = 2, i = 1
		i++; // 1 -> 2
		System.out.println(dan + " * " + i + " = " + (dan*i)); // dan = 2, i = 2
		i++; // 2 -> 3
		System.out.println(dan + " * " + i + " = " + (dan*i)); // dan = 2, i = 3
		i++; // 3 -> 4
		System.out.println(dan + " * " + i + " = " + (dan*i)); // dan = 2, i = 4
		i++; // 4 -> 5
		System.out.println(dan + " * " + i + " = " + (dan*i)); // dan = 2, i = 5
		i++; // 5 -> 6
		System.out.println(dan + " * " + i + " = " + (dan*i)); // dan = 2, i = 6
		i++; // 6 -> 7
		System.out.println(dan + " * " + i + " = " + (dan*i)); // dan = 2, i = 7
		i++; // 7 -> 8
		System.out.println(dan + " * " + i + " = " + (dan*i)); // dan = 2, i = 8
		i++; // 8 -> 9
		System.out.println(dan + " * " + i + " = " + (dan*i)); // dan = 2, i = 9
	
		System.out.println("============================================");
		
		System.out.println(" < "+ dan + "단 >");
		for(i = 1; i < 10; i++) { // 조건식: i <= 9
//			System.out.println(dan + " * " + i + " = " + (dan * i));
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		}
		
		

	}

}








