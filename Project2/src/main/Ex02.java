package main;

public class Ex02 {

	public static void main(String[] args) {  //여기서 부터 시작 자바가 시작하면 메인부터 찾음
		
		int x = 5;  //변수 선언과 동시에 값을 저장 두 개의 코드를 결합한 형태
		System.out.println(x); //출력
		x = 10;    // x의 값을 5에서 10으로 변경 그러므로 10번째 줄에서 x는 10으로 출력됨
		System.out.println(x); // ln이 없으면 줄바꿈 x ()괄호는 인자라고 부름

		int y = x; //x의 값을 y에 복사한다
		System.out.println(y); // 종료가 된 후 x와 y 값은 메모리 상에서 소멸

	}

}
