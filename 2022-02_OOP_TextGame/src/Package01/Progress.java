package Package01;

public class Progress {
	static int status = 10;
	Tree TREE = new Tree();
	Ending e = new Ending();
	PlaceandTreename p = new PlaceandTreename();
	static TreeArray t = new TreeArray();
	MiniGame1 MG1 = new MiniGame1();
	MiniGame2 MG2 = new MiniGame2();
	static Progress2 pr2 = new Progress2();
	static Progress3 pr3 = new Progress3();

	public void Set() {
		p.getTreename();
		System.out.println("장소 설정을 하겠습니다.");
		p.setPlace();
		System.out.println();
		System.out.println();
		System.out.println("도구 선정을 위해 미니게임 1을 진행하게 됩니다.");
		Main.pause.GetPause(2000);
		MG1.MG1Guide();
	}

	public void TalkwithTree() {
		switch (this.status) {
		case 10 -> this.First();
		case 20 -> pr2.Second();
		case 30 -> pr3.Third();

		}
	}

	public void First() {
		System.out.println("┌────────────────────────┐");
		System.out.println("      나무의 대화 1단계");
		System.out.println(t.OrdinaryTree[0]);
		System.out.printf("    %s : 여기는 어디야 ??\n", p.treename);
		System.out.println("└────────────────────────┘");
		System.out.println("내가 나무를 어디에 심었더라..?\n 정답 입력 : ");
		if (Main.input.next().equals(p.place)) {
			System.out.println("정답이다!");
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

		} else {
			System.out.println("┌────────────────────────┐");
			System.out.printf("    %s : 거기가 아닐텐데..?\n", p.treename);
			System.out.println("└────────────────────────┘");
		}
		System.out.println("다음 단계로 넘어갑니다.");
		Main.pause.GetPause(2000);
		System.out.println("┌────────────────────────┐");
		System.out.println("      나무의 대화 2단계");
		System.out.println(t.OrdinaryTree[1]);
		System.out.printf(" %s : 국민대는 참 좋은 학교야~\n", p.treename);
		System.out.println("└────────────────────────┘");
		System.out.println("다음 단계로 넘어갑니다.");
		Main.pause.GetPause(2000);
		System.out.println("┌────────────────────────┐");
		System.out.println("     나무의 대화 3단계");
		System.out.println(t.OrdinaryTree[2]);
		System.out.printf("  %s : 이 게임은 누가 만들었지?\n", p.treename);
		System.out.println("└────────────────────────┘");
		System.out.println("이 게임의 제작자를 입력해보자 (---팀)(4글자) : ");
		if (Main.input.next().equals("호우우팀")) {
			System.out.println("정답이다!");
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
		} else {
			System.out.println("┌────────────────────────┐");
			System.out.printf("    %s : 그게 아닐텐데..?\n", p.treename);
			System.out.println("└────────────────────────┘");
		}
		System.out.println("다음 단계로 넘어갑니다.");
		status += 10;
		Main.pause.GetPause(2000);
		this.TalkwithTree();
	}

}
