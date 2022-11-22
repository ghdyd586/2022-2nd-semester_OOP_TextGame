package Package01;

public class Progress3 extends Progress {
	public void Third() {
		System.out.println("┌────────────────────────┐");
		System.out.println("       나무의 대화 7단계");
		System.out.println(t.OrdinaryTree[6]);
		System.out.printf(" %s의 가지가 점점 많아지고 있다.\n", p.treename);
		System.out.println("└────────────────────────┘");
		System.out.println("무얼 해줄 수 있을까?\n세 개의 선택지 중 골라보자(숫자만 입력) : ");
		System.out.println("┌────────────────────────┐");
		System.out.println("       선 택 의 시 간 ");
		System.out.println("   1번 : 가지치기");
		System.out.println("   2번 : 비료주기");
		System.out.println("   3번 : 아무것도 안 하기");
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
		System.out.println("다음 단계로 넘어갑니다.");
		Main.pause.GetPause(1000);
		System.out.println("┌────────────────────────┐");
		System.out.println("       나무의 대화 8단계");
		System.out.println(t.OrdinaryTree[7]);
		System.out.println("");
		System.out.println("└────────────────────────┘");
		System.out.println("무얼 해줄 수 있을까?\n세 개의 선택지 중 골라보자(숫자만 입력) : ");
		System.out.println("┌────────────────────────┐");
		System.out.println("       선 택 의 시 간 ");
		System.out.println("   1번 : ");
		System.out.println("   2번 : ");
		System.out.println("   3번 : ");
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
		System.out.println("다음 단계로 넘어갑니다.");
		Main.pause.GetPause(1000);
		System.out.println("┌────────────────────────┐");
		System.out.println("       나무의 대화 9단계");
		System.out.println(t.OrdinaryTree[8]);
		System.out.printf(" %s : 얼마 안남았어! 좀만 힘내! \n", p.treename);
		System.out.println("└────────────────────────┘");
		System.out.println("다음 단계로 넘어갑니다.");
		Main.pause.GetPause(1000);
		System.out.println("┌────────────────────────┐");
		System.out.println("       나무의 대화 10단계");
		System.out.println(t.OrdinaryTree[9]);
		System.out.printf("   %s : 그동안 고생많았어!!\n", p.treename);
		System.out.println("└────────────────────────┘");
		Main.pause.GetPause(700);
		while (true) {
			System.out.println("나무가 다 자랐습니다.\n엔딩을 보러가시겠습니까?(y/n)");
			char choose1 = (Main.input.next()).charAt(0);
			if (choose1 == 'y') {
				e.showFinal();
				break;
			} else {
				System.out.println("엔딩은 꼭 보셔야 합니다. 다시 입력해 주세요");
			}

		}

	}

}
