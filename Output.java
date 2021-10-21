package OutputInput;

public class Output {
	
	public static void main(String[] args) {
		
		//[Output]
		/*
		 �ܼ� �����, Console Input, Console IO
		 - �⺻ �Է� ��ġ: Ű����
		 - �⺻ ��� ��ġ: �����
		 
		 Ű����� �����͸� �Է��ϴ� ���
		 ����ͷ� �����͸� ����ϴ� ���
		 
		 ==============================
		 �ܼ� ���
		 - ���� ������ ���ؼ� �پ��ϰ� ����
		 
		 1. System.out.print() �޼ҵ�
		 	- ����ϰ� ��
		 2. System.out.println() �޼ҵ�
		 	- ����ϰ� ����ġ�� ��
		 	- print line(�� ���� ���)
		 	
		 3. System.out.printf() �޼ҵ�(********)
		 	- �� ���
		 	- print format
		 	- ������ �������ش�. ����� �����ϰ� �����ִ� ���� ���ڿ��� �����Ѵ�.
		 	
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

		// ����ǥ > ǥ����
		String name1 = "������";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;

		String name2 = "������";
		int kor2 = 99;
		int eng2 = 89;
		int math2 = 79;

		System.out.println("============================");
		System.out.println("            ����ǥ");
		System.out.println("============================");
		System.out.println("[�̸�]\t[����]\t[����]\t[����]");
		System.out.println("----------------------------");

		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1 + "\t");
		System.out.print(eng1 + "\t");
		System.out.print(math1 + "\r\n");

		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);
		// System.out.println(kor2);

		// println()
		// �䱸����] "�ȳ��ϼ���. ȫ�浿��." > ���
		String name = "ȫ�浿";
		System.out.println("�ȳ��ϼ���. " + name + "��.");

		// �䱸����] "�ȳ��ϼ���. ȫ�浿��. �ݰ����ϴ�. ȫ�浿��." > ���
		System.out.println("�ȳ��ϼ���. " + name + "��. �ݰ����ϴ�. " + name + "��.");

		// �䱸����] "�ȳ��ϼ���. ȫ�浿��. �ݰ����ϴ�. ȫ�浿��. �߰�����. ȫ�浿��." > ���
		System.out.println("�ȳ��ϼ���. " + name + "��. �ݰ����ϴ�. " + name + "��. �߰�����. " + name + "��.");


		// printf()
		// - %s: ���� ����, Placeholder

		// �䱸����] "�ȳ��ϼ���. ȫ�浿��." > ���

		System.out.printf("�ȳ��ϼ���. %s��.\n", name); // �ȳ��ϼ���. ȫ�浿��.
		System.out.printf("�ȳ��ϼ���. %s��.\n", "�ƹ���"); // �ȳ��ϼ���. �ƹ�����.

		// �䱸����] "�ȳ��ϼ���. ȫ�浿��. �ݰ����ϴ�. ȫ�浿��." > ���
		System.out.printf("�ȳ��ϼ���. %s��. �ݰ����ϴ�. %s��.\n", name, name);

		// �䱸����] "�ȳ��ϼ���. ȫ�浿��. �ݰ����ϴ�. ȫ�浿��. �߰�����. ȫ�浿��." > ���
		System.out.printf("�ȳ��ϼ���. %s��. �ݰ����ϴ�. %s��. �߰�����. %s��.\n", name, name, name);

		
	}//main

}
