package OutputInput;

import java.io.IOException;

public class Input {
	
	public static void main(String[] args) throws IOException {
		
		//[Input]
		/*
		 콘솔 출력
		 1. print()
		 2. println()
		 3. printf()
		 
		 콘솔 입력
		 1. System.in.read()
		 	- 사용자가 입력한 문자를 읽어오는 기능
		 	- 읽어온 문자를 숫자(문자 코드값)로 돌려준다.
		 	- 영어와 숫자, 특수문자(ASCII)만 입력가능. 1바이트 입력만 가능
		
		 2. BufferedReader 클래스
		 3. Scanner 클래스
		 
		 */
		
		//요구사항] 사용자에게 문자 1개를 키보드로 입력받아 그대로 화면에 출력하시오.
		//입력 : A
		//출력 : 입력하신 문자는 A입니다.
		
		//사용자로부터 키보드 입력을 받는다.
		//System.out.print("입력 : ");
		
		//대기 상태. 블럭(Block) 걸렸다.
		//int data = System.in.read();
		
		//System.out.println(data);
		
		//Char -> 겉(문자), 속(숫자)
		//System.out.printf("입력하신 문자는 %c입니다.\n", data); //printf
		//System.out.println((char)data); //형변환(int -> char 변환)*****
		
		//----------------------
		// 대문자(26개)
		// A -> 65 *******암기
		// B -> 66
		// C -> 67
		// D -> 68
		// E -> 69
		// ...
		// Z -> 90
		// a -> 97 *******
		// z -> 122 ***
		// 0 -> 48 ******
		// 9 -> 57 **
		// ㄱ,ㄴ,ㄷ
		// 가,나,다,라..
		// 가 ~ 힣
		//----------------------
		
		// System.in.read() x 1회 -> 문자 1개 입력

		System.out.print("입력: "); //A

		int data = System.in.read(); // 버퍼안의 1문자를 가져와라
		System.out.println(data); //65

		data = System.in.read(); // 버퍼
		System.out.println(data); //13

		data = System.in.read(); // 버퍼
		System.out.println(data); //10

		data = System.in.read(); // 버퍼
		System.out.println(data);

		data = System.in.read();
		System.out.println(data);

		data = System.in.read();
		System.out.println("종료");
		
		
	}//main

}
