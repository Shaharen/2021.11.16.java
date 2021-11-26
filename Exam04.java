
public class Exam04 {

	public static void main(String[] args) {
		// 여러가지 자료형
		// Java에서 자료형은 크게 두가지로 나뉜다.
		// 1. 기본자료형  2. 레퍼런스 자료형
		// 1) 정수형 ( byte short int long )  char(문자)
		// byte - 1byte -128 ~ 127
		byte num1 = 127;
		// short - 2byte
		short num2 = 5000;
		// int - 4byte
		int num3 = 2000000;
		// long - 8byte
		long num4 = 222222222;
		
		// 2) 실수형 ( float double )
		// float - 4byte
		// Java에서 실수형은 기본적으로 Double로 인식한다
		float num5 = 10.4F;
		// float num5 = (float)10.4; 로도 쓸수 있음
		// double - 8byte
		double num6 = 222.12345;
		
		// 3) 논리형 ( boolean ) - 결과값이 true 또는 false
		// boolean - 1byte
		boolean isCheck = true;
		isCheck = false;
		
		// 4) 문자형 ( char )
		// char - 2byte ( 유니코드 )
		char text = 'A';
		text = '가';
		
		
		char test = 'A';
		int num10 = test;
		System.out.println(num10);
		
		// 변수명 규칙
		// 1. 키워드 사용 불가 ex) int int = 21; ( 안됨 )
		// 2. 변수명의 대소문자가 구분되며 길이에 제한이 없다. ex) int True; 와 int true; 는 다르다
		// 3. 숫자로 시작할 수 없다. ex) int 1a =0;
		// 4. 특수문자는 _와 $만 허용한다. ex) int_a 가능
		// 표기법 CamelCase -> 맨 앞글자는 소문자 새로운 단어시작에 대문자
		//  ex) int testTextTimeNameBack;
		// 표기법 SnakeCase -> 단어 사이에 언더바 표시
		//  ex) int test_text_time_name_back;
		// 이름 짓기 - curioustore.com
		
	
		
		
	}

}
