package main;

public class Ex06 {

	public static void main(String[] args) {
		
		float f = 3.14f; //float형은 식별자를 붙어야한다
		double d = 3.14; //double형은 정밀하게 표현가능
		
		//float형 변수에 값을 저장할때 식별자가 없으면 에러가 발생한다
		f = 3.0f; //식별자를 생략하면 에러가 발생된다 type missmatch
	 //f (float형으로 판단) = 3.0(double로 판단) 따라서 type이 missmatch가됨
		
	}  

}
