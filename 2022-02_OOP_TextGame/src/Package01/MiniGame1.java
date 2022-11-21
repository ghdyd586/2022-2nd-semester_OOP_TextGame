package Package01;

import java.util.Scanner;

public class MiniGame1 {
	private double mg1score;
	public int stagecnt;
	public long starttime;
	public long endtime;
	public long elapsedtime;
	public String useranswer;
	StringBuffer answer = new StringBuffer();
	Scanner input = new Scanner(System.in);

	String[] IdiomList = { "오매", "삼고", "과유", "사면", "유비", "고진", "낙화", "부화", "오비", "아전" };
	String[] AnswerList = { "불망", "초려", "불급", "초가", "무환", "감래", "유수", "뇌동", "이락", "인수" };

	public double GetScore() {
		return this.mg1score;
	}

	public void SetScore() {
		this.mg1score = 0;
	}

	public void SetupGame() {
		this.answer = new StringBuffer();
		this.starttime = 0;
		this.endtime = 0;
		this.answer.append(IdiomList[stagecnt]);
		this.answer.append("--");

	}

	public void MG1Guide() {
		while (true) {
			System.out.println("┌───────────────────────────────┐");
			System.out.println("        미 니 게 임 1 가 이 드");
			System.out.println("         사 자 성 어 맞 추 기 \n            게임 방법 ");
			System.out.println("\n    사자성어 앞 두 글자가 주어진다.\n    플레이어는 뒤의 두 글자를 맞춰야 한다.");
			System.out.println("    3초 안에 정답 시 점수 2배,\n    5초 안에 정답 시 점수 1.5배,    \n    10초가 넘어가면 0점이다.");
			System.out.println("    문제는 총 10문제 이며, \n    문제는 연속으로 주어진다.");
			System.out.println(" 게임을 시작하시려면 y를 입력해 주세요. : ");
			System.out.println("└───────────────────────────────┘");
			if ((input.next()).charAt(0) == 'y') {
				this.MG1Loading();
				this.SetScore();
				this.MG1Game1();
				break;
			} else {
				System.out.println("다시 입력해 주세요.");
			}
		}
	}

	public void MG1Loading() {
		System.out.println("3초 후에 시작합니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("게임 화면 이동중.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("게임 화면 이동중...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("게임 화면 이동중.....");

	}

	public void MG1Game1() {
		System.out.println("게임 시작!");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		for (int i = 0; i < this.IdiomList.length; i++) {
			this.SetupGame();
			if (i == 6) {
				while (true) {
					System.out.println("┌────────────────────────┐");
					System.out.println("         잘 하셨어요!");
					System.out.println("   지금부터는 난이도가 높아집니다!");
					System.out.println("         최대 3배까지\n       점수를 획득할 수 있어요~");
					System.out.println("   계속 하시려면 y를 입력 후 엔터\n   를 눌러주세요~ : ");
					System.out.println("└────────────────────────┘");
					if ((input.next()).charAt(0) == 'y') {
						this.MG1Loading();
						break;
					} else {
						System.out.println("다시 입력해 주세요.");
					}
				}
			}
			System.out.println("타이머 시작");
			this.starttime = System.currentTimeMillis();
			System.out.println("┌────────────────────────┐");
			System.out.println("   현재점수 : " + this.mg1score + "점");
			System.out.printf("          문제 %d.\n", this.stagecnt + 1);
			System.out.println("          " + this.answer);
			System.out.println("└────────────────────────┘");
			System.out.print("정답 입력 :");
			this.useranswer = input.next();
			this.endtime = System.currentTimeMillis();
			if (this.useranswer.equals(AnswerList[stagecnt])) {
				this.elapsedtime = (endtime - starttime) / 1000;
				if (i <= 6) {
					if (this.elapsedtime < 4) {
						mg1score += 15;
					} else if (this.elapsedtime < 6) {
						mg1score += 10;
					} else if (this.elapsedtime > 10) {
						mg1score += 0;
					} else {
						mg1score += 7;
					}
				} else {
					if (this.elapsedtime < 4) {
						mg1score += 10;
					} else if (this.elapsedtime < 6) {
						mg1score += 7.5;
					} else if (this.elapsedtime > 10) {
						mg1score += 0;
					} else {
						mg1score += 5;
					}
				}
				System.out.println("┌────────────────────────┐");
				System.out.println("          정 답            ");
				System.out.println("         " + this.IdiomList[this.stagecnt] + this.AnswerList[this.stagecnt]);
				System.out.println("       소요시간 : " + this.elapsedtime + "초");
				System.out.println("     현재점수 : " + this.mg1score + "점");
				System.out.println("└────────────────────────┘\n");
				this.stagecnt++;

			} else {
				System.out.println("틀렸습니다. 다시 시도하세요.");
			}

		}
		this.MG1Ending();

	}

	public void MG1Ending() {
		System.out.println("┌────────────────────────┐");
		System.out.println("     미 니 게 임 1 결 과");
		System.out.println("     획 득 점 수 : " + this.mg1score);
		System.out.println("└────────────────────────┘");
	}
}
