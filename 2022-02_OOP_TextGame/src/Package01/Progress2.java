package Package01;

public class Progress2 extends Progress {
	public void Second() {
		System.out.println("┌────────────────────────┐");
		System.out.println("       나무의 대화 4단계");
		System.out.println(t.OrdinaryTree[3]);
		System.out.printf("    %s에게 사춘기가 왔나보다.\n  기분이 매우 좋지 않아 보인다.\n", p.treename);
		System.out.println("└────────────────────────┘");
		System.out.println("무얼 해줄 수 있을까?\n세 개의 선택지 중 골라보자(숫자만 입력) : ");
		System.out.println("┌────────────────────────┐");
		System.out.println("       선 택 의 시 간 ");
		System.out.println("   1번 : 물주기");
		System.out.println("   2번 : 비료주기");
		System.out.println("   3번 : 뽀뽀하기");
		System.out.println("└────────────────────────┘");
		while (true) {
			int choose1 = Main.input.nextInt();
			if (choose1 == 1) {
				System.out.println("띠용");
				break;
			} else if (choose1 == 2) {
				System.out.println("띠요오옹");
				break;
			} else if (choose1 == 3) {
				System.out.println("띠요요요옹");
				break;
			} else {
				System.out.println("잘못 입력했다. 해당 선택지의 숫자만 눌러야 한다. 다시 해보자.");
			}
		}
		System.out.println("\n");
		Main.pause.GetPause(1500);
		System.out.println("┌──────────────┐");
		System.out.printf("    %s :♪ ♪\n", p.treename);
		System.out.println("└──────────────┘");
		Main.pause.GetPause(600);
		System.out.println("\n..?");
		System.out.println();
		Main.pause.GetPause(600);
		System.out.printf("%s(이)가 노래를 흥얼거리고 있다.\n", p.treename);
		Main.pause.GetPause(500);

		System.out.println("미니게임 2로 이동합니다.");
		Main.pause.GetPause(100);
		System.out.println();
		System.out.println("\n로딩중...");
		Main.pause.GetPause(1500);
		System.out.println("\n\n\n\n\n");
		MG2.MG2Guide();
		// 미니게임 2 클래스 삽입
		Main.pause.GetPause(1500);
		System.out.println("┌────────────────────────┐");
		System.out.println("       나무의 대화 5단계");
		System.out.println(t.OrdinaryTree[4]);
		System.out.printf("   %s : 오늘의 리빙포인트\n", p.treename);
		System.out.println("    이 게임을 만들고 있는");
		System.out.println("    11월 21일을 기준으로 ");
		System.out.println("    종강 : 23일\n    크리스마스 : 34일\n     2023년 새해 : 41일");
		System.out.println("     남았다. 깔깔.");
		System.out.println("└────────────────────────┘");
		System.out.println("다음 단계로 넘어갑니다.");
		Main.pause.GetPause(1500);
		System.out.println("┌────────────────────────┐");
		System.out.println("       나무의 대화 6단계");
		System.out.println(t.OrdinaryTree[5]);
		System.out.println("┻┳|\n┳┻|__∧\n┻┳|•﹃ •)\n┳┻|⊂ﾉ\n┻┳|Ｊ");
		System.out.println(" 이웃집 냥이가 미니게임을 물어왔다!");
		System.out.println("     냥이 : 해.줘.");
		System.out.println("└────────────────────────┘");
		System.out.println("미니게임 3으로 이동합니다.");
		// 미니게임 3 삽입
		status += 10;
		Main.pause.GetPause(1500);
		this.TalkwithTree();
	}

}
