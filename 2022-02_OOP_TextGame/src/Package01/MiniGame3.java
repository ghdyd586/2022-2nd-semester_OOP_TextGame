package Package01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MiniGame3 {
	
	private double MG3Score;

	public double GetScore() {
		return this.MG3Score;
	}

	public void SetScore() {
		this.MG3Score = 0;
	}

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
		System.out.println();
		System.out.println("기회가 " + life + "번 남았습니다.");
		System.out.println();
		MiniGame3.draw_man();

	}

	public static boolean checkAns(ArrayList<String> arr, String word, int life) {
		double MG3Score;
		String ansCheck = "";

		for (String x : arr) {
			ansCheck += x;
		}

		if (ansCheck.equals(word)) {
			System.out.println("벌레를 해치웠습니다!");
			System.out.println();

			if (MG3Score >= 35) {
				Opening.p1.SetBranchCnt(2);
				Opening.p1.SetFruitCnt(2);
				Opening.p1.SetFlowerCnt(2);
				System.out.println("총 점수는 " + MG3Score + "점 입니다!");
				System.out.println();
				System.out.println("나뭇가지 2개 + 열매 2개 + 꽃 2개를 획득합니다!");
			}

			else if (MG3Score >= 25 && MG3Score < 35) {
				Opening.p1.SetBranchCnt(1);
				Opening.p1.SetFruitCnt(1);
				Opening.p1.SetFlowerCnt(2);
				System.out.println("총 점수는 " + MG3Score + "점 입니다!");
				System.out.println();
				System.out.println("나뭇가지 1개 + 열매 1개 + 꽃 2개를 획득합니다!");
			}

			else if (MG3Score >= 15 && MG3Score < 25) {

				Opening.p1.SetBranchCnt(1);
				Opening.p1.SetFlowerCnt(1);
				System.out.println("총 점수는 " + MG3Score + "점 입니다!");
				System.out.println();
				System.out.println("열매 1개 + 꽃 1개를 획득합니다!");
			}

			else if (MG3Score >= 5 && MG3Score < 15) {
				Opening.p1.SetBranchcnt(-1);
				Opening.p1.SetFlowerCnt(1);
				System.out.println("총 점수는 " + MG3Score + "점 입니다!");
				System.out.println();
				System.out.println("꽃 1개를 획득했지만 나뭇가지 1개가 떨어졌습니다ㅜㅜ");
			}
			
			System.out.println();
			System.out.println("게임이 종료됩니다.");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			
			Progress.sb.SetMG3(this.MG3Score);
			return false;

		} else if (life == 0) {
			System.out.println("벌레가 늘어났습니다ㅠ");
			System.out.println();
			Opening.p1.SetBranchcnt(-1);
			Opening.p1.SetFlowerCnt(1);
			
			System.out.println("총 점수는 " + MG3Score + "점 입니다!");
			System.out.println();
			System.out.println("꽃 1개를 획득했지만 나뭇가지 1개가 떨어졌습니다ㅜㅜ");
			
			System.out.println();
			System.out.println("게임이 종료됩니다.");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			
			Progress.sb.SetMG3(MG3Score);
			return false;

		}

		else
			return true;

	}

	public static void main(String[] args) {
		String word = "";
		boolean go = true;
		while (go) {
			arr.clear();

			System.out.println("마지막 미니게임을 시작합니다!");
			System.out.println();
			System.out.println("벌레의 이름을 맞추면 벌레를 해치울 수 있고, 못 맞추면 벌레가 늘어 나무에 피해가 갑니다.");
			System.out.println();
			System.out.println("벌레를 빨리 해치울수록 높은 점수를 얻을 수 있습니다!");
			System.out.println();
			System.out.println("벌레들로부터 나무를 구해주세요!");
			System.out.println();
			System.out.println("'Start'를 입력하면 게임이 시작되고, 'End'를 입력하면 게임이 종료됩니다.");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			String two = scanner.nextLine();

			String ansCheck = "";

			if (two.equals("End")) {
				System.out.println("게임이 종료됩니다.");
				System.out.println(".");
				System.out.println(".");
				System.out.println(".");
				break;
			}

			else if (two.equals("Start")) {

				int ind = random.nextInt(words.length);
				word += words[ind];

				for (int i = 0; i < word.length(); i++) {
					arr.add("-");
				}

				board(arr, life);

				while (go) {
					System.out.println();
					System.out.println("알파벳 대문자 하나를 입력하세요.");
					System.out.println();
					String ans = scanner.nextLine();
					System.out.println();
					char letter = ans.charAt(0);

					if (arr.contains(ans)) {
						System.out.println("이미 입력된 알파벳입니다.");
					} else {
						for (int i = 0; i < word.length(); i++) {
							if (word.charAt(i) == letter) {
								arr.remove(i);
								arr.add(i, ans);
								System.out.println("맞췄습니다.");
								System.out.println();
								System.out.println("벌레가 없어지고 있어요!");
								System.out.println();
								System.out.println("_____________________________");
								System.out.println();
							}
						}

						if (!arr.contains(ans)) {
							life -= 1;
							System.out.println("틀렸습니다.");
							System.out.println();
							System.out.println("벌레가 늘어나고 있어요ㅜㅜ");
							System.out.println();
							System.out.println("_____________________________");
							System.out.println();

						}

						board(arr, life);
						System.out.println();
					}
					go = checkAns(arr, word, life);
				}

			}
		}
	}

	private static void draw_man() {
		if (life == 8) {
			System.out.println(" _\\_______/_ ");
			System.out.println("  |  o o  | ");
			System.out.println("  |       | ");
			System.out.println("  |       | ");
			System.out.println("  |       | ");
			System.out.println("  |       | ");
			System.out.println("   _______ ");
			System.out.println(" _/       \\_ ");
			MG3Score += 45;

		} else if (life == 7) {
			System.out.println(" _\\_______/_ ");
			System.out.println("  |  o o  | ");
			System.out.println(" -| --    | ");
			System.out.println("  |       | ");
			System.out.println("  |       | ");
			System.out.println("  |       | ");
			System.out.println("   _______ ");
			System.out.println(" _/       \\_ ");
			MG3Score += 40;

		} else if (life == 6) {
			System.out.println(" _\\_______/_ ");
			System.out.println("  |  o o  | ");
			System.out.println(" -| -- -- | ");
			System.out.println(" -|       | ");
			System.out.println("  |       | ");
			System.out.println("  |       | ");
			System.out.println("   _______ ");
			System.out.println(" _/       \\_ ");
			MG3Score += 35;

		} else if (life == 5) {
			System.out.println(" _\\_______/_ ");
			System.out.println("  |  o o  | ");
			System.out.println(" -| -- -- | ");
			System.out.println(" -| --    | ");
			System.out.println(" -|       | ");
			System.out.println("  |       | ");
			System.out.println("   _______ ");
			System.out.println(" _/       \\_ ");
			MG3Score += 30;

		} else if (life == 4) {
			System.out.println(" _\\_______/_ ");
			System.out.println("  |  o o  | ");
			System.out.println(" -| -- -- | ");
			System.out.println(" -| -- -- | ");
			System.out.println(" -|       | ");
			System.out.println(" -|       | ");
			System.out.println("   _______ ");
			System.out.println(" _/       \\_ ");
			MG3Score += 25;

		} else if (life == 3) {
			System.out.println(" _\\_______/_ ");
			System.out.println("  |  o o  | ");
			System.out.println(" -| -- -- |- ");
			System.out.println(" -| -- -- | ");
			System.out.println(" -| --    | ");
			System.out.println(" -|       | ");
			System.out.println("   _______ ");
			System.out.println(" _/       \\_ ");
			MG3Score += 20;

		} else if (life == 2) {
			System.out.println(" _\\_______/_ ");
			System.out.println("  |  o o  | ");
			System.out.println(" -| -- -- |- ");
			System.out.println(" -| -- -- |- ");
			System.out.println(" -| -- -- | ");
			System.out.println(" -|       | ");
			System.out.println("   _______ ");
			System.out.println(" _/       \\_ ");
			MG3Score += 15;

		} else if (life == 1) {
			System.out.println(" _\\_______/_ ");
			System.out.println("  |  o o  | ");
			System.out.println(" -| -- -- |- ");
			System.out.println(" -| -- -- |- ");
			System.out.println(" -| -- -- |- ");
			System.out.println(" -| --    | ");
			System.out.println("   _______ ");
			System.out.println(" _/       \\_ ");
			MG3Score += 10;

		} else {
			System.out.println(" _\\_______/_ ");
			System.out.println("  |  o o  | ");
			System.out.println(" -| -- -- |- ");
			System.out.println(" -| -- -- |- ");
			System.out.println(" -| -- -- |- ");
			System.out.println(" -| -- -- |- ");
			System.out.println("   _______ ");
			System.out.println(" _/       \\_ ");
			MG3Score = 5;
		}
	}
	
}
