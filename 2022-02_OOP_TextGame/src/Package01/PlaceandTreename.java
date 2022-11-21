package Package01;

import java.util.Random;
import java.util.Scanner;

public class PlaceandTreename {

	static String place;
	static String treename;
	Random r = new Random();
	Player pl = new Player();

	public String GetTreename() {
		return this.treename;
	}

	public void SetTreeName(String inputtreename) {
		this.treename = inputtreename; // 나무 이름
	}

	void getTreename() {
		Scanner in = new Scanner(System.in);

		System.out.println(pl.GetPlayerName() + "는 묘목을 받았다 !!");

		System.out.print("나무의 이름은 ?? : ");

		String inputtreename = in.next();
		if (inputtreename.length() > 6) {
			System.out.println("┌───────────────────────────┐");
			System.out.println("이름이 너무 길면 나무가 외우기 힘들어한다! \n   6자 이내로 이름을 지어주도록 하자.");
			System.out.println("└───────────────────────────┘");
			this.getTreename();
		}

		else {
			this.SetTreeName(inputtreename);
			;
			System.out.println("┌────────────────────────────┐");
			System.out.printf("  나무의 이름을 %s으로 결정했다 ! \n", this.GetTreename());
			System.out.println("└────────────────────────────┘");
		}
	}

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
		Scanner in = new Scanner(System.in);

		System.out.printf("%s을(를) 어디에다 심을까 ?? (장소 1 2 3 중 하나를 선택하자)\n", this.GetTreename());
		int i = in.nextInt();

		if (i == com[0]) {
			System.out.println(this.treename + "을(를) 한국에 심기로 결정했다 !! ");
			place = "한국";
		}

		else if (i == com[1]) {
			System.out.println(this.treename + "을(를) 러시아에 심기로 결정했다 !! ");
			place = "러시아";
		}

		else if (i == com[2]) {
			System.out.println(this.treename + "을(를) 브라질에 심기로 결정했다 !! ");
			place = "브라질";
		} else {
			this.setPlace();
		}

	}

}