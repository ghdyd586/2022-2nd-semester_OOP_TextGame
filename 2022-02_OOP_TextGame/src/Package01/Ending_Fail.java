package Package01;

public class Ending_Fail{

	static void ShowFinal() {
		//매개변수 : 플레이어 객체 p
		
		double FinalScore = Opening.p1.GetFinalScore();
		int branch = Opening.p1.GetBranchCnt();
		Ending e = new Ending();
		if (FinalScore != 0 && branch != 0) {
			return;
		}
		
		if (FinalScore == 0) {
			System.out.println("최종 점수 : 0");
			System.out.println(" ");
			System.out.println("점수가 0점이 되어 탈락했습니다ㅠㅠ");
			System.out.println(" ");
			System.out.println(" ");
		}

		else if (branch == 0) {
			System.out.println("최종 나뭇가지 개수 : 0");
			System.out.println(" ");
			System.out.println("나뭇가지가 0개가 되어 탈락했습니다ㅠㅠ");
			System.out.println(" ");
			System.out.println(" ");
		}

		System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("  @@@@@@@@@@             @@@@@@@@@@");
		System.out.println("  @@@@@@@@                 @@@@@@@@");
		System.out.println("  @@@@@@                     @@@@@@");
		System.out.println("  @@@@                         @@@@");
		System.out.println("  @@@                           @@@");
		System.out.println("  @@                             @@");
		System.out.println("  @@     @@@@@@@     @@@@@@@     @@");
		System.out.println("  @@        @           @        @@");
		System.out.println("  @@        @     @     @        @@");
		System.out.println("  @@        @           @        @@");
		System.out.println("  @@                             @@");
		System.out.println("  @@              @              @@");
		System.out.println("  @@             @ @             @@");
		System.out.println("  @@            @   @            @@");
		System.out.println("  @@           @@@@@@@           @@");
		System.out.println("  @@                             @@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@ _ __ ___  ___  _ __ __ __  _  _ _ @");
		System.out.println("@| / /| . || . || / /|  \\  \\| || \\ |@");
		System.out.println("@|  \\ | | || | ||  \\ |     || ||   |@");
		System.out.println("@|_\\_\\`___'`___'|_\\_\\|_|_|_||_||_\\_|@");
		System.out.println("@        >>대회에서 탈락했습니다<<        @");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		e.endingCredit();
		
	}
}