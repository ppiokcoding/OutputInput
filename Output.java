package OutputInput;

public class Output {
	
	public static void main(String[] args) {
		
		//[Output]
		/*
		 콘솔 입출력, Console Input, Console IO
		 - 기본 입력 장치: 키보드
		 - 기본 출력 장치: 모니터
		 
		 키보드로 데이터를 입력하는 방법
		 모니터로 데이터를 출력하는 방법
		 
		 ==============================
		 콘솔 출력
		 - 서식 구성을 위해서 다양하게 제공
		 
		 1. System.out.print() 메소드
		 	- 출력하고 끝
		 2. System.out.println() 메소드
		 	- 출력하고 엔터치고 끝
		 	- print line(줄 단위 출력)
		 	
		 3. System.out.printf() 메소드(********)
		 	- 多 기능
		 	- print format
		 	- 형식을 제공해준다. 출력을 용이하게 도와주는 형식 문자열을 제공한다.
		 	
		 */
		
		System.out.print(100);
		System.out.print(200);
		System.out.print(300);

		System.out.println(100);
		System.out.println(200);
		System.out.println(300);

		System.out.println();
		System.out.println();
		System.out.println();

		// 성적표 > 표형태
		String name1 = "가가가";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;

		String name2 = "나나나";
		int kor2 = 99;
		int eng2 = 89;
		int math2 = 79;

		System.out.println("============================");
		System.out.println("            성적표");
		System.out.println("============================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		System.out.println("----------------------------");

		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1 + "\t");
		System.out.print(eng1 + "\t");
		System.out.print(math1 + "\r\n");

		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);
		// System.out.println(kor2);

		// println()
		// 요구사항] "안녕하세요. 홍길동님." > 출력
		String name = "홍길동";
		System.out.println("안녕하세요. " + name + "님.");

		// 요구사항] "안녕하세요. 홍길동님. 반갑습니다. 홍길동님." > 출력
		System.out.println("안녕하세요. " + name + "님. 반갑습니다. " + name + "님.");

		// 요구사항] "안녕하세요. 홍길동님. 반갑습니다. 홍길동님. 잘가세요. 홍길동님." > 출력
		System.out.println("안녕하세요. " + name + "님. 반갑습니다. " + name + "님. 잘가세요. " + name + "님.");


		// printf()
		// - %s: 형식 문자, Placeholder

		// 요구사항] "안녕하세요. 홍길동님." > 출력

		System.out.printf("안녕하세요. %s님.\n", name); // 안녕하세요. 홍길동님.
		System.out.printf("안녕하세요. %s님.\n", "아무개"); // 안녕하세요. 아무개님.

		// 요구사항] "안녕하세요. 홍길동님. 반갑습니다. 홍길동님." > 출력
		System.out.printf("안녕하세요. %s님. 반갑습니다. %s님.\n", name, name);

		// 요구사항] "안녕하세요. 홍길동님. 반갑습니다. 홍길동님. 잘가세요. 홍길동님." > 출력
		System.out.printf("안녕하세요. %s님. 반갑습니다. %s님. 잘가세요. %s님.\n", name, name, name);

		
	}//main

}
