package quiz;

public class qz07 {

	public static void main(String[] args) {
		double d =1.2;
		float f = 0.9f;
		
		int i = (int)d; // 소수점아래를 잃어서 1.2에서 1이됨
		int i2 = (int)f;// 소수점아래를 잃어서 0.9에서 0이됨 
		int i3 = (int)d + (int)f;// 두 실수가 각각 형변환되어 더해져서 1이됨
		int i4 = (int)(d+f);// 먼저 더해서 2.1이 되었고, 소수점아래를 잃어서 2가됨 double + double -> (1.2 + 0.9)
	}

}
