package Package01;

import java.util.Random;
import java.util.Scanner;

public class Place {

	static String place;
	Random r = new Random();

	void setPlace() {

		int com[] = new int[3];

		while (com[0] == 0) {
			com[0] = r.nextInt(4);
		}
		while (com[1] == com[0] || com[1] == 0) {
			com[1] = r.nextInt(4);
		}
		while (com[2] == com[0] || com[2] == com[1] || com[2] == 0) {
			com[2] = r.nextInt(4);
		}

		System.out.println("나라를 선택하세요! (1~3)");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();

		if (i == com[0]) {
			System.out.println("나무를 키우게 될 장소는 한국입니다.");
			place = "한국";
		}

		else if (i == com[1]) {
			System.out.println("나무를 키우게 될 장소는 러시아입니다.");
			place = "러시아";
		}

		else if (i == com[2]) {
			System.out.println("나무를 키우게 될 장소는 브라질입니다.");
			place = "브라질";
		}

	}

}
