package Package01;

public class GetTool extends Player {
	private String tool1 = "조경사 친구";
	private String tool2 = "원예 공구 상자";
	private String tool3 = "삽과 물뿌리개";
	private boolean tool1get = false;
	private boolean tool2get = false;
	private boolean tool3get = false;
	
	public boolean returntool1() {
		return this.tool1get;
	}
	
	public boolean returntool2() {
		return this.tool2get;
	}
	public boolean returntool3() {
		return this.tool3get;
	}
	public String gettool1() {
		return this.tool1;
	}
	
	public String gettool2() {
		return this.tool2;
	}

	public String gettool3() {
		return this.tool3;
	}

	public void findtool1() {
		this.tool1get = true;
	}

	public void findtool2() {
		this.tool2get = true;
	}

	public void findtool3() {
		this.tool3get = true;
	}

	public void printtool() {
		if (this.tool1get == true) {
			Main.pause.GetPause(500);
			System.out.println("┌───────────────────────────────────────┐");
			Main.pause.GetPause(500);
			System.out.println(
					"┈┈▕▇▇▆▆\n┈┈▕▂    ▂▏\n┈┈▕┻▏┻▕╮\n┈┈▕   ▔  ▕ ╯\n┈╭━╲▔▔▕╭━━━╮\n╱▔╲ ╲▔▔▔▔╱ ╱▔▔╲ ╰╮\n▏ ┈╱▇▇▇▇╲┈┈▕╮┃\n▏ ▏  ╲ ▇▅▅ ┈╱┈▏▕┃╰╮\n▏ ▏ ┈╲▅▉ ╱┈┈▏▕╰╮┃\n▏ ╲┈┈╲╱┈┈┈▏▕╮┃╰╮");
			Main.pause.GetPause(500);
			System.out.println("최고의 동료이자 슈퍼 히어로 " + this.tool1 + "를 획득했다!");
			Main.pause.GetPause(500);
			System.out.println("└───────────────────────────────────────┘");
		}
		if (this.tool2get == true) {
			Main.pause.GetPause(500);
			System.out.println("┌───────────────────────────────────────┐");
			Main.pause.GetPause(500);
			System.out.println(" /▔▔▔▔▔▔▔▔▔/|\n/_____________/ |\n|     └─┘     | /\n|_____________|/");
			Main.pause.GetPause(500);
			System.out.println("이것만 있으면 나도 전문가! " + this.tool2 + "를 획득했다!");
			Main.pause.GetPause(500);
			System.out.println("└───────────────────────────────────────┘");
		}
		if (this.tool3get == true) {
			Main.pause.GetPause(500);
			System.out.println("┌───────────────────────────────────────┐");
			Main.pause.GetPause(500);
			System.out.println("  ⌒      _T____ . • . •  °\n / \\    // ￣\\￣  °  ° • .\n/ | \\  //\\   / \n￣凵￣ ￣  ￣￣");
			Main.pause.GetPause(500);
			System.out.println("조금 아쉽지만 이게 어디야~ " + this.tool3 + "를 획득했다!");
			Main.pause.GetPause(500);
			System.out.println("└───────────────────────────────────────┘");
		}
	}
}
