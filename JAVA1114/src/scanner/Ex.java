package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 
		 */

	Scanner scan = new Scanner(System.in);
	String input = "";
//	
//	do { // do ~ while문은 반드시 최소 1번을 실행
//		System.out.println("원하는 값을 입력하세요. 프로그램을 종료하려면 Q를 입력하세요 : ");
//		
//		// 입력한 값을 라인 단위로 읽어 온다.
//		input = scan.next();
//		// => 공백을 허용하지 않을 때 사용
//		// => 1 1 처럼 1과 1사이에 공백을 넣으면 구분자(demelimiter)로 생각
//		//    앞의 1만 입력받아 input에 대입
//		
//		input = scan.nextLine();
//		// => 라인 전체를 문자열로 인식함
//		// => 1 1을 넣으면 1 1 을 출력함
//		System.out.println("입력하신 값은" + input + "입니다.");
		
//	} while(!input.equals("Q")); // 해당조건을 만족하면 아래의 과정 수행하고 프로그램 끝남
//		System.out.println("프로그램을 종료합니다!");
		
		System.out.println("====================================================");
		
		System.out.println("숫자(정수)를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println(num);
		// => 정수가 아닌 다른 값을 입력하면 InputMismatchException 예외 발생!
		
		try {
			
		} catch (InputMismatchException e) {
//			e.printStackTrace();
			System.out.println("숫자(정수)만 입력하세요!");
		}
		
		System.out.println("숫자(실수)를 입력하세요 : ");
		double dnum = scan.nextDouble();
		System.out.println(dnum);
		// => 정수값을 입력하는 실수로 인식
		// => 숫자 이외의 문자나 문자열을 입력하면 InputMismatchException 발생
		
		System.out.println("true 또는 false 입력하세요 : ");
		boolean b = scan.nextBoolean();
		System.out.println(b);
		// => 대소문자를 구분하지 않고 true, Ture, TURE 또는 false, False, FALSE 등은 
		//	  허용하나 그 외의 문자 또는 문자열을 입력하면 InputMismatchException 발생
		
		
		
	}
}
