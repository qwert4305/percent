package percent;

public class PercentToFractionMain {

	public static void main(String[] args) {

		// 2021.06.19
		// 확률을 분수로 만들기 ( 정수 , 실수 )

		String percent = ""; // 확률
		int down = 0; // 분모
		Double up = 0.0; // 분자

		// 1. 정수
		percent = "50";
		down = 100;
		Double doublePercent = Double.parseDouble(percent);
		up = doublePercent;
		
		System.out.println("분모 : " + down);
		System.out.println("분자 : " + up);

	}

}
