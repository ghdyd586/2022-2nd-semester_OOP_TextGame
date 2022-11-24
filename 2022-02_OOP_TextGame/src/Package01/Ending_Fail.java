package teampro;

public class Ending_Fail {

	static void ShowFinal(//플레이어 객체 p) {
		double FinalScore = p.getScore();
		int branch = p.getBranch();
		
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

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@             @@@@@@@@@@");
		System.out.println("@@@@@@@@                 @@@@@@@@");
		System.out.println("@@@@@@                     @@@@@@");
		System.out.println("@@@@                         @@@@");
		System.out.println("@@@                           @@@");
		System.out.println("@@                             @@");
		System.out.println("@@     @@@@@@@     @@@@@@@     @@");
		System.out.println("@@        @           @        @@");
		System.out.println("@@        @     @     @        @@");
		System.out.println("@@        @           @        @@");
		System.out.println("@@                             @@");
		System.out.println("@@              @              @@");
		System.out.println("@@             @ @             @@");
		System.out.println("@@            @   @            @@");
		System.out.println("@@           @@@@@@@           @@");
		System.out.println("@@                             @@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@│ / ┌─┐ ┌─┐ │ / │\\/│ ─── │\\  │ @");
		System.out.println("@│<  │ │ │ │ │<  │  │  │  │ \\ │ @");
		System.out.println("@│ \\ └─┘ └─┘ │ \\ │  │ ─── │  \\│ @");
		System.out.println("@                               @");
		System.out.println("@      >>대회에서 탈락했습니다<<      @");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		endingCredit();

	}
}