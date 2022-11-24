package Package01;

public class ScoreBoard {
	private int MG1Score;
	private int MG2Score;
	private int MG3Score;

	public ScoreBoard(int MG1Score, int MG2Score, int MG3Score) {
		this.MG1Score = MG1Score;
		this.MG2Score = MG2Score;
		this.MG3Score = MG3Score;
	}

	public void ShowScoreBoard() {
		System.out.println("첫번째 미니게임 점수 : " + this.MG1Score);
		System.out.println(" ");
		System.out.println("두번째 미니게임 점수 : " + this.MG2Score);
		System.out.println(" ");
		System.out.println("세번째 미니게임 점수 : " + this.MG3Score);
		System.out.println(" ");
		int Total = this.MG1Score + this.MG2Score + this.MG3Score;
		System.out.println("미니게임 점수 총합 : " + Total);
		System.out.println(" ");

	}
}