
public class Exam03 {

	public static void main(String[] args) {
		// 문제. 선생님과 나의 나이를 바꿔봅시다.
		int teacher = 20;
		int my = 29;
		// 아래에 코드를 작성하여 나의 나이값과 선생님의 나이값을 서로 바꿔주세요(치환 문제)
		int temp = teacher;
		teacher = my;
		my = temp;
		
		System.out.println("선생님의 나이 : " + teacher);
		System.out.println("나의 나이 : " + my);
		
		

	}

}
