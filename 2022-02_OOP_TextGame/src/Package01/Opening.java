package Package01;

public class Opening {
	static Player p1 = new Player();

	void opening() {
		System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("  @@@@@@@@@@             @@@@@@@@@@");
		System.out.println("  @@@@@@@@                 @@@@@@@@");
		System.out.println("  @@@@@@                     @@@@@@");
		System.out.println("  @@@@                         @@@@");
		System.out.println("  @@@                           @@@");
		System.out.println("  @@      @@     @     @@        @@");
		System.out.println("  @@     @  @     @   @  @       @@");
		System.out.println("  @@      @@     @     @@        @@");
		System.out.println("  @@                             @@");
		System.out.println("  @@                             @@");
		System.out.println("  @@         @@@@@@@@            @@");
		System.out.println("  @@          @                  @@");
		System.out.println("  @@           @@@               @@");
		System.out.println("  @@                             @@");
		System.out.println("  @@                             @@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@                                   @");
		System.out.println("@ _ __ ___  ___  _ __ __ __  _  _ _ @");
		System.out.println("@| / /| . || . || / /|  \\  \\| || \\ |@");
		System.out.println("@|  \\ | | || | ||  \\ |     || ||   |@");
		System.out.println("@|_\\_\\`___'`___'|_\\_\\|_|_|_||_||_\\_|@");
		System.out.println("@   >>잠시 후 타이틀로 이동합니다.<<       @");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Main.pause.GetPause(1000);
		System.out.println("이동중.");
		Main.pause.GetPause(1000);
		System.out.println("이동중..");
		Main.pause.GetPause(1000);
		System.out.println("이동중...");
		Main.pause.GetPause(1000);
		System.out.println("이동중....");
		System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		this.title();
	}

	void title() {
		System.out.println("┌┐    ┌┐   ┌────┐  ┌───┐┌┐   ◜───◝  ┌───┐┌┐");
		System.out.println("││    │└┐  │ □  │  └──┐│││   │ ○ │  └──┐│││");
		System.out.println("│└─┐  │┌┘  └────┘    ┌┘│││   ◟───◞     ││││");
		System.out.println("└──┘  └┘   ┌───┐     └┐│││   ┌───┐     ││││");
		System.out.println("           └┐┌─┘      └┘└┘   └┐┌─┘     └┘└┘");
		System.out.println("            └┘                └┘");
		System.out.println("");
		System.out.println("                  @");
		System.out.println("                @.@@");
		System.out.println("                .\\|.@");
		System.out.println("               .@ |/.      ┌────────────────┐");
		System.out.println("               @\\ |.@           호우우 팀      ");
		System.out.println("               .\\\\|/.@       20190122 정호용  ");
		System.out.println("                 \\| /.       20190410 현진우  ");
		System.out.println("                  |/         20211857 최우정  ");
		System.out.println("               -------     └────────────────┘");
		System.out.println("                                             ");
		System.out.println(" >>>게임을 시작하시려면 start를 누르고 엔터를 눌러 주세요<<< ");
		while (true) {
			if (Main.input.next().equals("start")) {
				this.p1.ShowApplyForm();
				break;
			} else {
				System.out.println("다시 시도하세요.");
			}
		}
	}
}
