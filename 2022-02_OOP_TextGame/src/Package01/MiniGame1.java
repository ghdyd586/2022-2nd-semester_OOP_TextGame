package Package01;

public class MiniGame1 {
	private double mg1score; // 미니게임 1 점수
	public int stagecnt; // 미니게임 1 단계 카운트
	public int wrongcnt; // 미니게임 1 오답 카운트
	public long starttime; // 시작 시간 저장
	public long endtime; // 종료 시간 저장
	public long elapsedtime; // 문제 풀이 소요시간
	public String useranswer; // 사용자가 입력한 정답 저장
	StringBuffer answer = new StringBuffer(); // Stringbuffer 객체
	GetTool g1 = new GetTool(); // GetTool 객체 생성
	String[] IdiomList = { "오매", "삼고", "과유", "사면", "유비", "고진", "낙화", "부화", "오비", "아전" };
	String[] AnswerList = { "불망", "초려", "불급", "초가", "무환", "감래", "유수", "뇌동", "이락", "인수" };
	public double GetScore() {
		return this.mg1score;
	}// 미니게임 1 점수 접근자
	public void SetScore() {
		this.mg1score = 0;
	}// 미니게임 1 점수 설정자
	public void SetupGame() {
		this.answer = new StringBuffer();
		this.starttime = 0;
		this.endtime = 0;
		this.answer.append(IdiomList[stagecnt]);
		this.answer.append("--");
	}// 각종 필드 초기화 메소드 및 문제 초기화
	public void MG1Guide() {
		while (true) {
			System.out.println("┌───────────────────────────────┐");
			System.out.println("        미 니 게 임 1 가 이 드");
			System.out.println("         사 자 성 어 맞 추 기 \n            게임 방법 ");
			System.out.println("\n    사자성어 앞 두 글자가 주어진다.\n    플레이어는 뒤의 두 글자를 맞춰야 한다.");
			System.out.println("    3초 안에 정답 시 점수 2배,\n    5초 안에 정답 시 점수 1.5배,    \n    10초가 넘어가면 0점이다.");
			System.out.println("    두 번 연속으로 틀리면 5점씩 감점 후 \n   다음 문제로 넘어간다.");
			System.out.println("    문제는 총 10문제 이며, \n    문제는 연속으로 주어진다.");
			System.out.println();
			System.out.println("      점 수 에 따 른 도 구 보 상");
			System.out.println("     135점 ~ 100점 : 조경사 친구");
			System.out.println("     100점 ~  70점 : 원예 공구 상자");
			System.out.println("      70점 ~   0점 : 삽과 물뿌리개");
			System.out.println("    게임을 시작하시려면 \"그래\"를 \n      입력해 주세요. : ");
			System.out.println("└───────────────────────────────┘");
			String input = Main.input.next();
			if (input.equals("그래")) {
				this.MG1Loading(); // 로딩화면 연결
				this.SetScore(); // 점수 초기화 메소드 호출
				this.MG1Game1(); // 게임화면 호출
				break; 
			} else {
				System.out.println("다시 입력해 주세요.");
			}
		}
	}
	public void MG1Loading() {
		System.out.println("3초 후에 시작합니다.");
		Main.pause.GetPause(1000); // 1초 일시정지
		System.out.println("게임 화면 이동중.");
		Main.pause.GetPause(1000); // 1초 일시정지
		System.out.println("게임 화면 이동중...");
		Main.pause.GetPause(1000); // 1초 일시정지
		System.out.println("게임 화면 이동중.....");
	}
	public void MG1Game1() {
		System.out.println("게임 시작!");
		Main.pause.GetPause(500); // 0.5초 일시정지
		for (int i = 0; i < this.IdiomList.length; i++) {
			this.SetupGame(); // 문제 초기화 및 생성
			this.wrongcnt = 0; // 오답횟수 초기화
			if (i == 6) {
				while (true) {
					System.out.println("┌────────────────────────┐");
					System.out.println("         잘 하셨어요!");
					System.out.println("   지금부터는 난이도가 높아집니다!");
					System.out.println("   최대 3배까지\n    점수를 획득할 수 있어요~");
					System.out.println("   계속 하시려면 \"그래\"를 입력 후 \n   엔터를 눌러주세요~ : ");
					System.out.println("   아무거나 입력하면\n   이대로 게임을 종료합니다.");
					System.out.println("└────────────────────────┘");
					String input = Main.input.next();
					if (input.equals("그래")) {
						this.MG1Loading(); // 로딩화면 연결
						break;
					} else {
						System.out.println("게임을 종료합니다.");
						this.MG1Ending(); // 바로 게임 종료
						break;
					}
				}
			}
			System.out.println("타이머 시작"); 
			this.starttime = System.currentTimeMillis(); // 타이머 호출
			while (true) {
				System.out.println("┌────────────────────────┐");
				System.out.println("   현재점수 : " + this.mg1score + "점");
				System.out.println("   틀린횟수 : " + this.wrongcnt + "회");
				System.out.printf("          문제 %d.\n", this.stagecnt + 1);
				System.out.println("          " + this.answer);
				System.out.println("└────────────────────────┘"); // 문제 화면
				System.out.print("정답 입력 :");
				this.useranswer = Main.input.next();
				if (this.useranswer.equals(AnswerList[stagecnt])) {
					this.endtime = System.currentTimeMillis(); // 타이머 호출
					this.elapsedtime = (endtime - starttime) / 1000; // 소요시간 계산
					if (i <= 6) {
						if (this.elapsedtime < 4) {
							mg1score += 15;
						} else if (this.elapsedtime < 6) {
							mg1score += 10;
						} else if (this.elapsedtime > 10) {
							mg1score += 0;
						} else {
							mg1score += 7;
						}// 소요시간에 따른 점수 차등 (1~5번 문제)
					} else {
						if (this.elapsedtime < 4) {
							mg1score += 10;
						} else if (this.elapsedtime < 6) {
							mg1score += 7.5;
						} else if (this.elapsedtime > 10) {
							mg1score += 0;
						} else {
							mg1score += 5;
						}// 소요시간에 따른 점수 차등 (6~10번 문제)
					}
					System.out.println("┌────────────────────────┐");
					System.out.println("          정 답            ");
					System.out.println("         " + this.IdiomList[this.stagecnt] + this.AnswerList[this.stagecnt]);
					System.out.println("       소요시간 : " + this.elapsedtime + "초");
					System.out.println("     현재점수 : " + this.mg1score + "점");
					System.out.println("└────────────────────────┘\n");
					this.stagecnt++; // 정답 시 단계 카운트 ++
					Main.pause.GetPause(500); // 0.5초 일시정지
					break;
				} else {
					if (this.wrongcnt >= 1) // 오답 2회 시
					{
						System.out.println("다음 문제로 넘어갑니다.");
						mg1score -= 5; // 5점 감점
						this.stagecnt++; // 단계 카운트 ++
						Main.pause.GetPause(500);
						break;
					}
					else {						
						System.out.println("틀렸습니다. 다시 시도하세요.");
						this.wrongcnt++; // 오답 카운트 ++
					}
				}
			}
		}
		this.MG1Ending(); // 모든 문제 수행 후 결과창 호출
	}
	public void MG1Ending() {
		System.out.println("┌────────────────────────┐");
		System.out.println("     미 니 게 임 1 결 과");
		System.out.println("     획 득 점 수 : " + this.mg1score);
		System.out.println("└────────────────────────┘");
		if (this.mg1score >= 100) {
			g1.findtool1(); // 100점 이상 시 조경사 도구 획득 
		} else if (this.mg1score >= 70) {
			g1.findtool2(); // 70점 이상 시 도구 세트 획득
		} else {
			g1.findtool3(); // 70점 미만 시 삽과 물뿌리개 획득
		}
		g1.printtool(); // 도구 획득 문구 출력
		Progress.sb.SetMG1(this.mg1score); // 미니게임 1 스코어 저장
		System.out.println("미니게임 1 종료힙니다.");
		Main.pause.GetPause(2000); // 2초 일시정지
		Player.pr.TalkwithTree(); // 나무와의 대화 메소드 호출
	}
}
