
public class Exam03 {

	public static void main(String[] args) {
		// ����. �����԰� ���� ���̸� �ٲ㺾�ô�.
		int teacher = 20;
		int my = 29;
		// �Ʒ��� �ڵ带 �ۼ��Ͽ� ���� ���̰��� �������� ���̰��� ���� �ٲ��ּ���(ġȯ ����)
		int temp = teacher;
		teacher = my;
		my = temp;
		
		System.out.println("�������� ���� : " + teacher);
		System.out.println("���� ���� : " + my);
		
		

	}

}
