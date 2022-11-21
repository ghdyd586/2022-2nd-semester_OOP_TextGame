package Package01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Ending e = new Ending();
		Place p = new Place();

		// p.setPlace();
		// System.out.print("총능력치 : ");
		// e.FinalScore = in.nextDouble();
		// e.showFinal();
		GetToolandPlace gtp = new GetToolandPlace();
		gtp.printtool();
	}

}