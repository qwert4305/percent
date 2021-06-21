package percent;

public class PercentToFractionMain {

	public static void main(String[] args) {

		// 2021.06.19
		// 확률을 분수로 만들기 ( 정수 , 실수 )
		String percent = ""; // 확률
		int down = 0; // 분모
		Double up = 0.0; // 분자

		// 1. 정수 ( ex > 50 -> 50 % 확률 -> 100 분의 5 )
		percent = "50";
		down = 100;
		Double doublePercent = Double.parseDouble(percent);
		up = doublePercent;

		System.out.println("분모 : " + down);
		System.out.println("분자 : " + up);

		// 2. 실수
		// 2-1. split
		String str = "가,나,다,라,마"; // 쪼갤 문자열
		String[] strArray = str.split(","); // split("기준문자")
											// 쪼개진 문자 나눠서 담을 배열

		// 쪼개진 문자 담긴 배열 for 문으로 출력
		for (String s : strArray) {
			System.out.println(s);
		}

		// 2-2. 실수 ( ex> 0.5 -> 0.5 % -> 1000 분의 5 )
		percent = "0.5"; 
		int p = 0; // 소수점 아래 몇개의 문자 있는지 확인
		String[] percentArray = percent.split("\\."); // . 만 할 시 .을 기준으로 쪼갠 문자라는 것을 인식 못함
		System.out.println(percentArray.length); // 쪼갠 문자열 개수 확인

		
		// 쪼개진 문자 확인
		for (int i = 0; i < percentArray.length; i++) {
			System.out.println(percentArray[i]);

			p = percentArray[1].length(); // . 으로 구분된 1번의 인덱스 -> 소수점 아래 문자 개수
			System.out.println("소수점 아래 문자 개수 : " + p); 
			// p = percent.split("//.")[0].length(); 에러남.. 다시 해보기...!!!

			String a = "1"; // 소수점 아래 문자 개수만큼 0더해지기 위해 String 1 선언

			for (int j = 0; j < p; j++) { // 소수점 아래 문자 개수 만큼 1에 0 더함 -> 소수점 첫째 자리면 "1+0" 둘째 자리면 "1+00"
				a += "0";
				System.out.println("a : " + a);
			}

			down = (Integer.parseInt(a) * 100); // 소수점 아래 문자 개수에 따라 만들어진 10, 100 에 100 을 곱함 ( ex> 0.5 -> 분모가 1000분의 5 이니까...)
			up = (Double.parseDouble(percent) * Integer.parseInt(a)); // 실수 -> 정수로 만든 후 ( ex> 0.5 -> 분자 5) percent 가 double 형이라 형변환
			System.out.println("분모 : " + down);
			System.out.println("분자 : " + up);

		}


	}

}
