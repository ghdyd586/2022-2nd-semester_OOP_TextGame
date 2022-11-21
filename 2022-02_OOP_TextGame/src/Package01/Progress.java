package Package01;

public class Progress {
	static int status = 10;
	Tree TREE = new Tree();
	Ending e = new Ending();
	Place p = new Place();
	TreeArray t = new TreeArray();
	MiniGame1 MG1 = new MiniGame1();
	static Progress2 pr2 = new Progress2();
	static Progress3 pr3 = new Progress3();

	public void Set() {
		System.out.println("장소 설정을 하겠습니다.");
		p.setPlace();
		System.out.println("도구 선정을 위해 미니게임을 진행하게 됩니다.");
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
		System.out.println("    나무 : 여기는 어디야 ??");
		System.out.println("└────────────────────────┘");
		System.out.println("내가 나무를 어디에 심었더라..?\n 정답 입력 : ");
		if (Main.input.next().equals(p.place)) {

		} else {
			System.out.println("┌────────────────────────┐");
			System.out.println("    나무 : 거기가 아닐텐데..?");
			System.out.println("└────────────────────────┘");
		}
		System.out.println("다음 단계로 넘어갑니다.");

		System.out.println("┌────────────────────────┐");
		System.out.println("      나무의 대화 2단계");
		System.out.println(t.OrdinaryTree[1]);
		System.out.println(" 나무 : 국민대는 참 좋은 학교야~");
		System.out.println("└────────────────────────┘");
		System.out.println("다음 단계로 넘어갑니다.");

		System.out.println("┌────────────────────────┐");
		System.out.println("     나무의 대화 3단계");
		System.out.println(t.OrdinaryTree[2]);
		System.out.println("  나무 : 이 게임은 누가 만들었지?");
		System.out.println("└────────────────────────┘");
		System.out.println("이 게임의 제작자를 입력해보자 (---팀)(4글자) : ");
		if (Main.input.next().equals("호우우팀")) {

		} else {
			System.out.println("┌────────────────────────┐");
			System.out.println("    나무 : 그게 아닐텐데..?");
			System.out.println("└────────────────────────┘");
		}
		System.out.println("다음 단계로 넘어갑니다.");
		status += 10;
		this.TalkwithTree();
	}

}
