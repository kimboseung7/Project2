package main;

public class Ex09 {
//자동형변환과 강제형변환
	public static void main(String[] args) {
		//정수형
		byte b = 10;
	    int i = b;     //byte는 int 보다 덜 정교하기 때문에 작은거에서 큰쪽으로 자동형변환 // 1byte to 4byte
	    System.out.println(b);
	    
	    //실수형
	    float f = 10.0f;
	    double d = f; //f변수의 값을 d변수에 복사한다 float 보다 double이 더 정교하므로 자동형변환 // 4byte to 8byte
	    System.out.println(f);
	    
	    //정수형과 실수형
	    int iNum = 1;
	    float fNum = iNum;// 더 정밀한 쪽으로 변환할 때 자동형변환 4byte to 4byte 이지만 float이 소수점을 표현하기 때문에 더 정밀
	    System.out.println(fNum);
	    
	    //연산중에 자동변환 되는 경우
	    //컴퓨터가 더하기 연산을 수행할 때, 두 항을 같은 자료형으로 변환
	    // 이때 iNum이 float형으로 자동형변환 더 정교한쪽으로 결과값이 나옴, 원본값에는 지장x 카피해서 이용
	    System.out.println(iNum+fNum);

	}

}
