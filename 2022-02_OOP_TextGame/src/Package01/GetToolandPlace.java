package Package01;

public class GetToolandPlace extends Player {
	private String tool1 = "조경사의 손길";
	private String tool2 = "원예 공구 상자";
	private String tool3 = "삽과 물뿌리개";
	boolean tool1get = true;
	private boolean tool2get = false;
	private boolean tool3get = false;

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
			System.out.println(
					"┈┈▕▇▇▆▆\n┈┈▕▂    ▂▕▏\n┈┈▕┻▏┻▕╮\n┈┈▕   ▔  ▕ ╯\n┈╭━╲▔▔▕╭━━━╮\n╱▔╲ ╲▔▔▔▔╱ ╱▔▔╲ ╰╮\n▏ ┈╱▇▇▇▇╲┈┈▕╮┃\n▏ ▏  ╲ ▇▅▅ ┈╱┈▏▕┃╰╮\n▏ ▏ ┈╲▅▉ ╱┈┈▏▕╰╮┃\n▏ ╲┈┈╲╱┈┈┈▏▕╮┃╰╮");
			System.out.println("최고의 동료이자 슈퍼 히어로 조경사 친구를 획득했다!");
		} else if (this.tool2get == true) {

		} else if (this.tool3get == true) {

		}
	}
}
