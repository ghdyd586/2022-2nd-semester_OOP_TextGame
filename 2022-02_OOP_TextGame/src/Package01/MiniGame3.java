package Package01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MiniGame3 {

	public static String[] words = { "LADYBUG", "MOSQUITO", "MANTIS", "BUTTERFLY", "BUMBLEBEE" };
	public static Random random = new Random();
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<String> arr = new ArrayList<>();
	static int life = 8;

	public static void board(ArrayList<String> arr, int life) {
		for (String x : arr) {
			System.out.print(x);
		}
		System.out.println();
		System.out.println("기회가 " + life + "번 남았습니다.");
		System.out.println();

	}

	public static boolean checkAns(ArrayList<String> arr, String word, int life) {

		String ansCheck = "";

		for (String x : arr) {
			ansCheck += x;
		}

		if (ansCheck.equals(word)) {
			System.out.println("벌레를 해치웠습니다!");
			System.out.println();
			System.out.println("나뭇가지 2개를 획득합니다.");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
//			branch += 2;
			return false;
		} else if (life == 0) {
			System.out.println("벌레가 늘어났습니다ㅠㅠ");
			System.out.println();
			System.out.println("게임이 종료됩니다.");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			return false;
		}

		else
			return true;

	}

	public static void main(String[] args) {
		while (true) {
			String word = "";
			arr.clear();

//			int life = 8;

			System.out.println("마지막 미니게임을 시작합니다!");
			System.out.println();
			System.out.println("벌레의 이름을 맞추면 벌레를 해치울 수 있고, 못 맞추면 벌레가 늘어 나무에 피해가 갑니다.");
			System.out.println();
			System.out.println("벌레들로부터 나무를 구해주세요!");
			System.out.println();
			System.out.println("'Start'를 입력하면 게임이 시작되고, 'End'를 입력하면 게임이 종료됩니다.");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			String two = scanner.nextLine();

			if (two.equals("End")) {
				System.out.println("게임이 종료됩니다.");
				break;
			} else if (two.equals("Start")) {

				int ind = random.nextInt(words.length);
				word += words[ind];

				for (int i = 0; i < word.length(); i++) {
					arr.add("-");
				}

				board(arr, life);

				while (checkAns(arr, word, life)) {
					System.out.println("알파벳 대문자 하나를 입력하세요.");

					String ans = scanner.nextLine();

					char letter = ans.charAt(0);

					if (arr.contains(ans)) {
						System.out.println("이미 입력된 알파벳입니다.");
					} else {
						for (int i = 0; i < word.length(); i++) {
							if (word.charAt(i) == letter) {
								arr.remove(i);
								arr.add(i, ans);
							}
						}

						if (!arr.contains(ans)) {
							life -= 1;
						}
					}

					board(arr, life);
					System.out.println();
				}
			} else {
				System.out.println("틀렸습니다.");
				continue;
			}
		}
	}



private void draw_man() {
	switch (MiniGame3.life) {
	case 8:
		System.out.println(" _\\_____//_ ");
		System.out.println("  |  o o  | ");
		System.out.println("  |       | ");
		System.out.println("  |       | ");
		System.out.println("  |       | ");
		System.out.println("  |       | ");
		System.out.println("   _______ ");
		System.out.println(" _//     \\_ ");
		break;
	case 7:
		System.out.println(" _\\_____//_ ");
		System.out.println("  |  o o  | ");
		System.out.println(" -|       | ");
		System.out.println("  |       | ");
		System.out.println("  |       | ");
		System.out.println("  |       | ");
		System.out.println("   _______ ");
		System.out.println(" _//     \\_ ");
		break;
	case 6:
		System.out.println(" _\\_____//_ ");
		System.out.println("  |  o o  | ");
		System.out.println(" -|       | ");
		System.out.println(" -|       | ");
		System.out.println("  |       | ");
		System.out.println("  |       | ");
		System.out.println("   _______ ");
		System.out.println(" _//     \\_ ");
		break;
	case 5:
		System.out.println(" _\\_____//_ ");
		System.out.println("  |  o o  | ");
		System.out.println(" -|       | ");
		System.out.println(" -|       | ");
		System.out.println(" -|       | ");
		System.out.println("  |       | ");
		System.out.println("   _______ ");
		System.out.println(" _//     \\_ ");
		break;
	case 4:
		System.out.println(" _\\_____//_ ");
		System.out.println("  |  o o  | ");
		System.out.println(" -|       | ");
		System.out.println(" -|       | ");
		System.out.println(" -|       | ");
		System.out.println(" -|       | ");
		System.out.println("   _______ ");
		System.out.println(" _//     \\_ ");
		break;
	case 3:
		System.out.println(" _\\_____//_ ");
		System.out.println("  |  o o  | ");
		System.out.println(" -|       |- ");
		System.out.println(" -|       | ");
		System.out.println(" -|       | ");
		System.out.println(" -|       | ");
		System.out.println("   _______ ");
		System.out.println(" _//     \\_ ");
		break;
	case 2:
		System.out.println(" _\\_____//_ ");
		System.out.println("  |  o o  | ");
		System.out.println(" -|       |- ");
		System.out.println(" -|       |- ");
		System.out.println(" -|       | ");
		System.out.println(" -|       | ");
		System.out.println("   _______ ");
		System.out.println(" _//     \\_ ");
		break;
	case 1:
		System.out.println(" _\\_____//_ ");
		System.out.println("  |  o o  | ");
		System.out.println(" -|       |- ");
		System.out.println(" -|       |- ");
		System.out.println(" -|       |- ");
		System.out.println(" -|       | ");
		System.out.println("   _______ ");
		System.out.println(" _//     \\_ ");
		break;
	case 0:
		System.out.println(" _\\_____//_ ");
		System.out.println("  |  o o  | ");
		System.out.println(" -|       |- ");
		System.out.println(" -|       |- ");
		System.out.println(" -|       |- ");
		System.out.println(" -|       |- ");
		System.out.println("   _______  ");
		System.out.println(" _//     \\_ ");
		break;
		}
	}
}
