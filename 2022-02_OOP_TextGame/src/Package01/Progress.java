package Package01;

public class Progress {
	static int status = 10; // 진행 상황 카운트
	Tree TREE = new Tree(); // 나무 출력 객체 생성
	Ending e = new Ending(); // 엔딩 객체 생성
	PlaceandTreename p = new PlaceandTreename(); // 나무 이름과 장소 선정 객체 생성
	static TreeArray t = new TreeArray(); // 단계별 나무 출력 객체 생성
	MiniGame1 MG1 = new MiniGame1(); // 미니게임1 객체 생성
	MiniGame2 MG2 = new MiniGame2(); // 미니게임2 객체 생성
	MiniGame3 MG3 = new MiniGame3(); // 미니게임3 객체 생성
	static Progress2 pr2 = new Progress2(); // 중반부 진행 객체 생성
	static Progress3 pr3 = new Progress3(); // 후반부 진행 객체 생성	
	
	public void Set() {
		p.getTreename(); // 나무 이름 입력 메소드 호출
		System.out.println("장소 설정을 하겠습니다.");
		p.setPlace(); // 장소 선정 메소드 호출
		System.out.println();
		System.out.println();
		System.out.println("도구 선정을 위해 미니게임 1을 진행하게 됩니다.");
		Main.pause.GetPause(2000);
		MG1.MG1Guide(); // 미니게임 1 가이드 메소드 호출
	}

	public void TalkwithTree() {
		switch (this.status) {
		case 10 -> this.First(); // 초반부 진행
		case 20 -> pr2.Second(); // 중반부 진행
		case 30 -> pr3.Third(); // 후반부 진행

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
				Opening.p1.SetBranchCnt(1); // 생명 증감
				Opening.p1.SetFlowerCnt(3); // 꽃 증감
				Opening.p1.SetFruitCnt(2); // 열매 증감
				System.out.println("나뭇가지 1개 / 열매 1개 / 꽃 2개 획득! \n그리고 "+ MG1.g1.gettool1() + "보너스 적용! (추가 열매 1개 / 꽃 1개)");
			}
			else if(MG1.g1.returntool2() == true) {
				Opening.p1.SetFlowerCnt(1); // 꽃 증감
				Opening.p1.SetFruitCnt(2); // 열매 증감
				System.out.println("열매 1개 / 꽃 1개 획득! \n그리고 "+ MG1.g1.gettool2() + "보너스 적용! (추가 열매 1개)");
			}
			else {
				Opening.p1.SetFlowerCnt(1); // 꽃 증감
				System.out.println(MG1.g1.gettool3() + "보너스 적용! (추가 꽃 1개)");
			}

		} else {
			System.out.println("┌────────────────────────┐");
			System.out.printf("    %s : 거기가 아닐텐데..?\n", p.treename);
			System.out.println("└────────────────────────┘");
		}
		System.out.println("다음 단계로 넘어갑니다.");
		Main.pause.GetPause(2000); // 2초 일시정지
		System.out.println("┌────────────────────────┐");
		System.out.println("      나무의 대화 2단계");
		System.out.println(t.OrdinaryTree[1]);
		System.out.printf(" %s : 국민대는 참 좋은 학교야~\n", p.treename);
		System.out.println("└────────────────────────┘");
		System.out.println("다음 단계로 넘어갑니다.");
		Main.pause.GetPause(2000); // 2초 일시정지
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
				Opening.p1.SetBranchCnt(1); // 생명 증감
				Opening.p1.SetFlowerCnt(3); // 꽃 증감
				Opening.p1.SetFruitCnt(2); // 열매 증감
				System.out.println("나뭇가지 1개 / 열매 1개 / 꽃 2개 획득! \n그리고 "+ MG1.g1.gettool1() + "보너스 적용! (추가 열매 1개 / 꽃 1개)");
			}
			else if(MG1.g1.returntool2() == true) {
				Opening.p1.SetFlowerCnt(1); // 꽃 증감
				Opening.p1.SetFruitCnt(2); // 열매 증감
				System.out.println("열매 1개 / 꽃 1개 획득! \n그리고 "+ MG1.g1.gettool2() + "보너스 적용! (추가 열매 1개)");
			}
			else {
				Opening.p1.SetFlowerCnt(1); // 꽃 증감
				System.out.println(MG1.g1.gettool3() + "보너스 적용! (추가 꽃 1개)");
			}
		} else {
			System.out.println("┌────────────────────────┐");
			System.out.printf("    %s : 그게 아닐텐데..?\n", p.treename);
			System.out.println("└────────────────────────┘");
		}
		System.out.println("다음 단계로 넘어갑니다.");
		status += 10; // 진행도 증가
		Main.pause.GetPause(2000);
		this.TalkwithTree(); // 진행도에 따라 중반부 진행상황으로 이동
	}
	

}
