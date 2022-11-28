package Package01;

public class Ending_Fail {
	
	static void ShowFailFinal() {
		//매개변수 : 플레이어 객체 p
		
		int branch = Opening.p1.GetBranchCnt();
//		Ending e = new Ending();
		
		if (branch != 0) {
			return;
		}

		else if (branch == 0) {
			System.out.println("최종 나뭇가지 개수 : 0");
			System.out.println(" ");
			System.out.println("나뭇가지가 다 떨어져서 탈락했습니다ㅠㅠ");
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

		
	}
}
