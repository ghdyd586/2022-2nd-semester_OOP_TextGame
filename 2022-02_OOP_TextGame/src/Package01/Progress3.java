package Package01;

public class Progress3 extends Progress {
	public void Third() {
		System.out.println("┌────────────────────────┐");
		System.out.println("       나무의 대화 7단계");
		System.out.println(t.OrdinaryTree[6]);
		System.out.println("");
		System.out.println("└────────────────────────┘");
		System.out.println("다음 단계로 넘어갑니다.");
		Main.pause.GetPause(2000);
		System.out.println("┌────────────────────────┐");
		System.out.println("       나무의 대화 8단계");
		System.out.println(t.OrdinaryTree[7]);
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
			if (choose1 == 1)
			{
				System.out.println("가지를 치니 나무가 답답해 하던 증상이 없어졌다!");
				Main.pause.GetPause(1500);
				if(MG1.g1.returntool1() == true)
				{
					System.out.println("--획득! 그리고 "+ MG1.g1.gettool1() + "보너스 적용! (-%)");
				}
				else if(MG1.g1.returntool2() == true) {
					System.out.println("--획득! 그리고 "+ MG1.g1.gettool2() + "보너스 적용! (-%)");
				}
				else {
					System.out.println("--획득! 그리고 "+ MG1.g1.gettool3() + "보너스 적용! (-%)");
				}
				break;
			}
			else if (choose1 == 2)
			{
				System.out.println("비료는 나무에게 종합비타민 같은 존재이다!\n근데 나무가 답답해 한다..");
				Main.pause.GetPause(1500);
				if(MG1.g1.returntool1() == true)
				{
					System.out.println("--획득! 그리고 "+ MG1.g1.gettool1() + "보너스 적용! (-%)");
				}
				else if(MG1.g1.returntool2() == true) {
					System.out.println("--획득! 그리고 "+ MG1.g1.gettool2() + "보너스 적용! (-%)");
				}
				else {
					System.out.println("--획득! 그리고 "+ MG1.g1.gettool3() + "보너스 적용! (-%)");
				}
				break;
			}
			else if (choose1 == 3)
			{
				System.out.println("나무가 답답해 하는 것 안 보이니?!?!? 큰일이다!!");
				Main.pause.GetPause(1500);
				if(MG1.g1.returntool1() == true)
				{
					System.out.println("--획득! 그리고 "+ MG1.g1.gettool1() + "보너스 적용! (-%)");
				}
				else if(MG1.g1.returntool2() == true) {
					System.out.println("--획득! 그리고 "+ MG1.g1.gettool2() + "보너스 적용! (-%)");
				}
				else {
					System.out.println("--획득! 그리고 "+ MG1.g1.gettool3() + "보너스 적용! (-%)");
				}
				break;
			}
			else
			{
				System.out.println("잘못 입력했다. 해당 선택지의 숫자만 눌러야 한다. 다시 해보자.");

			}
		}
		System.out.println("다음 단계로 넘어갑니다.");
		Main.pause.GetPause(2000);
		System.out.println("┌────────────────────────┐");
		System.out.println("       나무의 대화 9단계");
		System.out.println(t.OrdinaryTree[8]);
		System.out.printf(" %s : 얼마 안남았어! 좀만 힘내! \n", p.treename);
		System.out.println("└────────────────────────┘");
		System.out.println("다음 단계로 넘어갑니다.");
		System.out.println("9단계 까지 오는 동안 약 1년이 지났다.");
		Main.pause.GetPause(800);
		System.out.println(p.treename + "은(는) 아직 꼬마 나무지만");
		Main.pause.GetPause(800);
		System.out.println("꽤나 씩씩하고 든든해 보인다.");
		Main.pause.GetPause(800);
		System.out.println(p.treename +"가 마지막으로 할 말이 있어 보인다.");
		Main.pause.GetPause(800);
		System.out.println("┌────────────────────────┐");
		System.out.println("       나무의 대화 10단계");
		System.out.println(t.OrdinaryTree[9]);
		System.out.printf("   %s : 그동안 고생많았어!!\n", p.treename);
		System.out.println("└────────────────────────┘");
		Main.pause.GetPause(3000);
		System.out.println("┌────────────────────────┐");
		System.out.println(Opening.p1.GetPlayerName() +" : 이제 학교에 제출해야 겠다.");
		System.out.println("└────────────────────────┘");
		Main.pause.GetPause(1500);
		while (true) {
			System.out.println("나무가 다 자랐습니다.\n엔딩을 보러가시겠습니까?(응/아니)");
			String input = Main.input.next();
			if (input.equals("응")) {
				e.showFinal();
				break;
			} else {
				System.out.println("엔딩은 꼭 보셔야 합니다. 다시 입력해 주세요");
			}

		}

	}

}
