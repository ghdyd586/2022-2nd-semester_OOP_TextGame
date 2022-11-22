package Package01;

import java.util.Random;
import java.util.Scanner;
class Pause{
	void GetPause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}
}
public class Main {
	static Scanner input = new Scanner(System.in);
	static Random r = new Random();
	static Pause pause = new Pause();
	public static void main(String[] args) {
		Opening o1 = new Opening();
		o1.opening();

	}

}
