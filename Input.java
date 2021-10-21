package OutputInput;

import java.io.IOException;

public class Input {
	
	public static void main(String[] args) throws IOException {
		
		//[Input]
		/*
		 �ܼ� ���
		 1. print()
		 2. println()
		 3. printf()
		 
		 �ܼ� �Է�
		 1. System.in.read()
		 	- ����ڰ� �Է��� ���ڸ� �о���� ���
		 	- �о�� ���ڸ� ����(���� �ڵ尪)�� �����ش�.
		 	- ����� ����, Ư������(ASCII)�� �Է°���. 1����Ʈ �Է¸� ����
		
		 2. BufferedReader Ŭ����
		 3. Scanner Ŭ����
		 
		 */
		
		//�䱸����] ����ڿ��� ���� 1���� Ű����� �Է¹޾� �״�� ȭ�鿡 ����Ͻÿ�.
		//�Է� : A
		//��� : �Է��Ͻ� ���ڴ� A�Դϴ�.
		
		//����ڷκ��� Ű���� �Է��� �޴´�.
		//System.out.print("�Է� : ");
		
		//��� ����. ��(Block) �ɷȴ�.
		//int data = System.in.read();
		
		//System.out.println(data);
		
		//Char -> ��(����), ��(����)
		//System.out.printf("�Է��Ͻ� ���ڴ� %c�Դϴ�.\n", data); //printf
		//System.out.println((char)data); //����ȯ(int -> char ��ȯ)*****
		
		//----------------------
		// �빮��(26��)
		// A -> 65 *******�ϱ�
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
		// ��,��,��
		// ��,��,��,��..
		// �� ~ �R
		//----------------------
		
		// System.in.read() x 1ȸ -> ���� 1�� �Է�

		System.out.print("�Է�: "); //A

		int data = System.in.read(); // ���۾��� 1���ڸ� �����Ͷ�
		System.out.println(data); //65

		data = System.in.read(); // ����
		System.out.println(data); //13

		data = System.in.read(); // ����
		System.out.println(data); //10

		data = System.in.read(); // ����
		System.out.println(data);

		data = System.in.read();
		System.out.println(data);

		data = System.in.read();
		System.out.println("����");
		
		
	}//main

}
