package percent;
import java.util.Random;

public class PercentMain {

	public static void main(String[] args) {

		// 0 - 4 까지의 난수 중 0,1,2,3,4 가 나올 확률 100 %
		Random itemSelect = new Random();

		int item1 = 0; // 10 % (10개의 난수 중 1개가 당첨일 확률)
		int item2 = 1; // 10 % (10개의 난수 중 1개가 당첨일 확률)
		int item3 = 3; // 60 % (10개의 난수 중 6개가 당첨일 확률)
		int item4 = 4; // 20 % (10개의 난수 중 2개가 당첨일 확률)
		int item5 = 5; // 100 % (10개의 난수 중 10개가 당첨일 확률)

		int card = 5;

		// 0 - 4 까지의 난수를 랜덤으로 생성(nextInt) 해서 5개(for문) 뽑음
		for (int i = 0; i < 5; i++) { // 난수 5개 뽑음
			int select = (int) itemSelect.nextInt(5); // 0 - 4 까지의 난수
			System.out.print(select + "/");

			if (select >= 0 && select <= 5) { // 뽑은 난수가 0,1,2,3,4 중 하나이면
				System.out.println("당첨"); // 당첨

			}
		}

	}
}
