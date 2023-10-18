package quiz;
/*
 * short형 변수 s를 선언하고 값 10을 대입하세요
 * int형 변수 i를 선언하고 값 20을 대입하세요
 * 정수형 변수 sum을 선언하고 두 수의 합을 저장하세요
 * */
public class qz06 {

	public static void main(String[] args) {
		short s = 10;
		int i = 20;
		int sum  = s+i; //두 수의 결과를 저장하려면 변수를 최소 int형으로 선언해야한다
		//만약 short형으로 변수를 생성하면 값의 loss가 생긴다
		
		System.out.println(sum);
	}

}
