package Package01;

public class Ending extends Player{
	
	int FinalScore = this.GetFinalScore(); // 총능력치 : 열매+꽃
	String tree;
	PlaceandTreename p = new PlaceandTreename();

	String tree() {
		this.SetFinalScore();
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
		System.out.println("  . . .");
		Main.pause.GetPause(1000);
		System.out.println();
		System.out.println("  . . .");
		Main.pause.GetPause(1000);
		System.out.println();
		System.out.println("  . . .");
		Main.pause.GetPause(1000);
		System.out.println("최종점수는 "+ this.FinalScore+"입니다.");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.printf("  -%s-\n", tree());
		System.out.println();
		Main.pause.GetPause(500);


		if (FinalScore >= 10) {
			System.out.println(Progress.t.TreeforEnding[0]);
			Main.pause.GetPause(100);
			System.out.printf("%s(이)가 심었던 %s(은)는 %s(이)가 되었다!!\n", Opening.p1.GetPlayerName(), p.treename, tree);
			Main.pause.GetPause(1000);

			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println(" KMU 나무 키우기 경진대회");
			System.out.println();
			System.out.println("             상   장");
			System.out.println("                          대상     ");
			System.out.println("                       " + Opening.p1.GetPlayerName());
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
			System.out.println(Progress.t.TreeforEnding[1]);
			Main.pause.GetPause(100);

			System.out.printf("%s(이)가 심었던 %s(은)는 %s(이)가 되었다!!\n", Opening.p1.GetPlayerName(), p.treename, tree);
			Main.pause.GetPause(1000);

			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println(" KMU 나무 키우기 경진대회");
			System.out.println();
			System.out.println("             상   장");
			System.out.println("                       최우수상     ");
			System.out.println("                       " + Opening.p1.GetPlayerName());
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
			System.out.println(Progress.t.TreeforEnding[1]);
			Main.pause.GetPause(100);

			System.out.printf("%s(이)가 심었던 %s(은)는 %s(이)가 되었다!\n", Opening.p1.GetPlayerName(), p.treename, tree);
			Main.pause.GetPause(1000);

			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println(" KMU 나무 키우기 경진대회");
			System.out.println();
			System.out.println("             상   장");
			System.out.println("                       우수상     ");
			System.out.println("                       " + Opening.p1.GetPlayerName());
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
			System.out.println(Progress.t.TreeforEnding[2]);
			Main.pause.GetPause(100);

			System.out.printf("%s(이)가 심었던 %s(은)는 %s(이)가 되었다.....\n", Opening.p1.GetPlayerName(), p.treename, tree);
			Main.pause.GetPause(1000);

			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println(" KMU 나무 키우기 경진대회");
			System.out.println();
			System.out.println("             상   장");
			System.out.println("                       장려상     ");
			System.out.println("                       " + Opening.p1.GetPlayerName());
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
		this.endingCredit();

	}

	void endingCredit() {
		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("                역할 분배\n");
		Main.pause.GetPause(700);
		System.out.println("              기획,제작 : 호우우팀");
		Main.pause.GetPause(700);
		System.out.println("  오프닝,플레이어 정보,미니게임1,나무와의 대화 : 정호용");
		Main.pause.GetPause(700);
		System.out.println("   엔딩,나무이름 짓기, 미니게임2, 장소정하기 : 현진우");
		Main.pause.GetPause(700);
		System.out.println("     미니게임 3, 실패 엔딩 , 스코어보드 : 최우정");
		Main.pause.GetPause(700);
		System.out.println("          감  사  합  니  다 !  !  ");
		Main.pause.GetPause(700);
		System.out.println("  ░░★░░░░░█▄░▄█ █▀▀░█▀█░█▀█░█░█░░░★░░░░░░");
		Main.pause.GetPause(700);
		System.out.println("  ░░░░░★░░█░▀░█ █▀▀░██▀░██▀░▀█▀░░░░░░★░░░");
		Main.pause.GetPause(700);
		System.out.println("  ░░★░░░░░▀░░░▀ ▀▀▀░▀░▀░▀░▀░░▀░░░░★░░░░░░");
		Main.pause.GetPause(700);
		System.out.println("  ░░█▀▀░█░█ █▀█░█░█▀▀░▀█▀ █▄░▄█ █▀█░█▀▀░░");
		Main.pause.GetPause(700);
		System.out.println("  ░░█░░░█▀█ ██▀░█░▀▀█░░█░ █░▀░█ █▀█░▀▀█░░");
		Main.pause.GetPause(700);
		System.out.println("  ░░▀▀▀░▀░▀ ▀░▀░▀░▀▀▀░░▀░ ▀░░░▀ ▀░▀░▀▀▀░░");
		Main.pause.GetPause(700);
		System.out.println("└─────────────────────────────────────────┘");
		Main.pause.GetPause(2000);
		System.out.println("게임을 종료합니다.");
		System.exit(0);
	}
}