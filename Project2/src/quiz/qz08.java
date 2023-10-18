package quiz;
/*
 *변수 두개를 선언해서 10과 2.0대입
 *두 변수의 사칙연산 결과를 정수로 변경
 * */
public class qz08 {

	public static void main(String[] args) {
		int a = 10;
		float b = 2.0f;
		int i1 =(int)a + (int)b;
		int i2 =(int)a - (int)b;
		int i3 =(int)a * (int)b;
		int i4 = (int)a / (int)b;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
//System.out.println((int)(a+b)); 로 써도됨
	}

}
