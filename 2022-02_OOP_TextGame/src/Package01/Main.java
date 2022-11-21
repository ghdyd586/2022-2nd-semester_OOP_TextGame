package Package01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Opening o1 = new Opening();
		Player p1 = new Player();
		o1.opening();
		o1.title();
		if ((input.next() != null)) {
			p1.ShowApplyForm();
		}
		MiniGame1 MG1 = new MiniGame1();
		MG1.MG1Guide();
		//
		// MG1.SetupGame();
		// MG1Game();

	}

}
