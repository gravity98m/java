package io_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {
		// BufferedReader 를 사용하여 문자열을 입력
		// 입력스트림에서 한 줄의 데이터(문자열) 읽어오기
		// => readLine() 메서드 활용
		// 출력스트림을 통해서 입력데이터 출력
		// => getBytes() 메서드 활용
		// Tip) try with resources 구문 작성 시
		//      try() 문장 소괄호 내에 복수 개의 객체를 세미콜론(;)으로
		//      구분하여 전달 가능!!
		//      try(입력스트림;출력스트림){ } 가능
		
		// ex) 키보드를 통해 "Hello, 자바"를 입력하면
		//     모니터에 "입력한 데이터는 Hello, 자바 입니다."가 출력
		
		// BufferedReader 를 사용하여 문자열을 입력
		// 1. 기본 입력스트림 객체(InputStream) 생성 = byte 단위 처리
//		   InputStream is = System.in;
		// 2. 입력스트림을 연결하는 보조스트림 InputStreamReader 객체 생성 = char 단위 처리
//		   InputStreamReader reader = new InputStreamReader(is);
		// 3. 향상된 입력 보조스트림 BufferedReader 객체 생성 = String 단위 처리
//		   BufferedReader buffer = new BufferedReader(reader);
		// ---------------------------- 위의 세문장을 하나의 문장을 결합 ---------------
//		   BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		   // try with resources 구문 작성 시
		   // try() 문장 소괄호 내에 복수 개의 객체를 세미콜론(;)으로 구분하여 전달
		   try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				   OutputStream os = System.out){
			   System.out.println("데이터를 입력하세요 : ");
			   
			   // 입력스트림에서 한 줄의 데이터(문자열) 읽어오기
			   String str = buffer.readLine();
			   
			   System.out.println("입력한 데이터는 ");
			   
			   // 출력스트림을 통해 입력데이터 출력하기
			   os.write(str.getBytes());
			   
			   System.out.println(" 입니다.\n");
					   
		   } catch(IOException e) {
			   e.printStackTrace();
		   }
			  
	}

}
