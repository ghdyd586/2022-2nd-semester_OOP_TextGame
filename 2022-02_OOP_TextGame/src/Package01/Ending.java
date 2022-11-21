package Package01;

public class Ending {

	double FinalScore; // 총능력치 : 열매+꽃
	String tree;
	Place p = new Place();

	String tree() {
		if (p.place.equals("브라질")) {
			if (FinalScore >= 10)
				tree = "야자수나무";
			else if (FinalScore > 5 && FinalScore < 10)
				tree = "바오밥나무";
			else if (FinalScore < 5)
				tree = "가지만있는나무";
		}
		if (p.place.equals("한국")) {
			if (FinalScore >= 10)
				tree = "무궁화나무";
			else if (FinalScore > 5 && FinalScore < 10)
				tree = "벚꽃나무";
			else if (FinalScore < 5)
				tree = "소나무";
		}
		if (p.place.equals("러시아")) {
			if (FinalScore >= 10)
				tree = "단풍나무";
			else if (FinalScore > 5 && FinalScore < 10)
				tree = "자작나무";
			else if (FinalScore < 5)
				tree = "가지만있는나무";
		}
		return tree;
	}

	void showFinal() {
		TreeArray TA = new TreeArray();

		System.out.println("  . . .");
		System.out.println("  . . .");

		System.out.printf(" -%s-\n", tree());

		System.out.println(TA.OrdinaryTree[9]);
		System.out.printf("%s(이)가 심었던 %s는 %s가 되었다!!\n", Opening.p1.GetPlayerName(), "treename", tree);

		System.out.println();
		System.out.println("┌───────────────────────────────┐");
		System.out.println(" KMU 나무 키우기 경진대회");
		System.out.println();
		System.out.println("             상   장");
		System.out.println("                       " + Opening.p1.GetPlayerName());
		System.out.println();
		System.out.println("   본 학생은 treename을 " + tree + "로");
		System.out.println();
		System.out.println("    잘 성장시켜 훌륭한 결과를 얻어냈기에");
		System.out.println();
		System.out.println("          이 상장을 수여함.");
		System.out.println();
		System.out.println("└───────────────────────────────┘");

	}

	void endingCredit() {

	}
}