package Package01;

public class Ending {

	double FinalScore; // 총능력치 : 열매+꽃
	String tree;
	PlaceandTreename p = new PlaceandTreename();

	String tree() {
		if (p.place.equals("브라질")) {
			if (FinalScore >= 10)
				tree = "야자수나무";
			else if (FinalScore > 5 && FinalScore < 10)
				tree = "바오밥나무";
			else if (FinalScore < 5)
				tree = "잡종나무";
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
				tree = "앙상한나무";
		}
		return tree;
	}

	void showFinal() {
		TreeArray TA = new TreeArray();
		Player p1 = new Player();
		System.out.println("  . . .");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println();
		System.out.println("  . . .");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.printf("-%s-\n", tree());
		System.out.println();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}

		System.out.println(TA.OrdinaryTree[9]);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}

		if (FinalScore >= 10) {
			System.out.printf("%s가 심었던 %s는 %s가 되었다!!\n", p1.GetPlayerName(), p.GetTreename(), tree);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println(" KMU 나무 키우기 경진대회");
			System.out.println();
			System.out.println("             상   장");
			System.out.println("                          대상     ");
			System.out.println("                       " + p1.GetPlayerName());
			System.out.println();
			System.out.println("   본 학생은 " + p.treename + "을(를) " + tree + "로");
			System.out.println();
			System.out.println("    잘 성장시켜 훌륭한 결과를 얻어냈기에");
			System.out.println();
			System.out.println("          이 상장을 수여함.");
			System.out.println();
			System.out.println("                        ★★★★★");
			System.out.println("└───────────────────────────────┘");
		}

		else if (FinalScore > 8 && FinalScore < 10) {
			System.out.printf("%s가 심었던 %s는 %s가 되었다!!\n", p1.GetPlayerName(), p.treename, tree);

			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println(" KMU 나무 키우기 경진대회");
			System.out.println();
			System.out.println("             상   장");
			System.out.println("                       최우수상     ");
			System.out.println("                       " + p1.GetPlayerName());
			System.out.println();
			System.out.println("    본 학생은 " + p.treename + "을(를) " + tree + "로");
			System.out.println();
			System.out.println("    잘 성장시켜 훌륭한 결과를 얻어냈기에");
			System.out.println();
			System.out.println("          이 상장을 수여함.");
			System.out.println();
			System.out.println("                        ★★★★☆");
			System.out.println("└───────────────────────────────┘");
		}

		else if (FinalScore > 5 && FinalScore < 8) {
			System.out.printf("%s가 심었던 %s는 %s가 되었다!\n", p1.GetPlayerName(), p.treename, tree);

			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println(" KMU 나무 키우기 경진대회");
			System.out.println();
			System.out.println("             상   장");
			System.out.println("                       우수상     ");
			System.out.println("                       " + p1.GetPlayerName());
			System.out.println();
			System.out.println("    본 학생은 " + p.treename + "을(를) " + tree + "로");
			System.out.println();
			System.out.println("    잘 성장시켜 준수한 결과를 얻어냈기에");
			System.out.println();
			System.out.println("          이 상장을 수여함.");
			System.out.println();
			System.out.println("                        ★★★☆☆");
			System.out.println("└───────────────────────────────┘");
		}

		else if (FinalScore < 5) {
			System.out.printf("%s가 심었던 %s는 %s가 되었다.....\n", p1.GetPlayerName(), p.treename, tree);

			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println(" KMU 나무 키우기 경진대회");
			System.out.println();
			System.out.println("             상   장");
			System.out.println("                       장려상     ");
			System.out.println("                       " + p1.GetPlayerName());
			System.out.println();
			System.out.println("    본 학생은 " + p.treename + "을(를) " + tree + "로");
			System.out.println();
			System.out.println("     성장시켜 그럭저럭한 결과를 얻어냈기에");
			System.out.println();
			System.out.println("          이 상장을 수여함.");
			System.out.println();
			System.out.println("                        ★★☆☆☆");
			System.out.println("└───────────────────────────────┘");
		}

	}

	void endingCredit() {

	}
}