package Package01;

public class ScoreBoard {
	private double MG1Score;
	private double MG2Score;
	private double MG3Score;
	
	public void SetMG1(double MG1Score) {
		this.MG1Score = MG1Score;
	}
	public void SetMG2(double MG2Score) {
		this.MG2Score = MG2Score;
	}
	public void SetMG3(double MG3Score) {
		this.MG3Score = MG3Score;
	}

	public void ShowScoreBoard() {
		System.out.println("┌─────────────────────────────┐");
		System.out.println(" 첫번째 미니게임 점수 : " + this.MG1Score+"점");
		System.out.println(" ");
		System.out.println(" 두번째 미니게임 점수 : " + this.MG2Score+"점");
		System.out.println(" ");
		System.out.println(" 세번째 미니게임 점수 : " + this.MG3Score+"점");
		System.out.println(" ");
		double Total = this.MG1Score + this.MG2Score + this.MG3Score;
		System.out.println(" 미니게임 점수 총합 : " + Total+"점");
		System.out.println("└─────────────────────────────┘");

	}
	
	public void ShowFFB(){
		System.out.println("┌─────────────────────────────┐");
		System.out.println("          중 간 점 검");
		System.out.printf(" 나무가지 개수 : %d개\n",Opening.p1.GetBranchCnt());
		System.out.printf(" 열매 개수 : %d개\n",Opening.p1.GetFruitCnt());
		System.out.printf(" 꽃 개수 : %d개\n",Opening.p1.GetFlowerCnt());
		System.out.printf(" 예상 점수 : %d점\n",Opening.p1.GetFlowerCnt() + (Opening.p1.GetFruitCnt()*2));
		System.out.println("└─────────────────────────────┘");
	}
}