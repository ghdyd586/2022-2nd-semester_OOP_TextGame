package Package01;

import java.util.Scanner;

public class Player {
	private static String prplayername; // 플레이어 이름 선언
	private static int FlowerCnt; // 꽃 카운트 변수 선언
	private static int FruitCnt; // 열매 카운트 변수 선언
	private static int BranchCnt; // 나뭇가지 카운트 변수 선언

	public String GetPlayerName() {
		return this.prplayername; // 플레이어 이름 접근자
	}

	public void SetPlayerName(String inputplayername) {
		this.prplayername = inputplayername; // 플레이어 이름 설정자
	}

	public int GetFlowerCnt() {
		return this.FlowerCnt; // 꽃 카운트 접근자
	}

	public int GetFruitCnt() {
		return this.FruitCnt; // 열매 카운트 접근자
	}

	public int GetBranchCnt() {
		return this.BranchCnt; // 나뭇가지 카운트 접근자
	}

	public void ShowApplyForm() {
		System.out.println("┌──────────────────────┐");
		System.out.println("   KMU 나무키우기 경진대회   ");
		System.out.println("        참가신청서      ");
		System.out.println();
		System.out.println("    참가자 이름 : ");
		System.out.println("└──────────────────────┘");
		System.out.print("     참가 신청서를 받았다!\n   이름을 적어보자(5자 이하) : ");
		Scanner input = new Scanner(System.in);
		String inputplayername = input.next(); // 플레이어명 입력받기
		if (inputplayername.length() > 5) {
			System.out.println("┌──────────────────────┐");
			System.out.println("   이름이 너무 깁니다\n   다시 입력해 주세요.");
			System.out.println("└──────────────────────┘");
			this.ShowApplyForm();
		} else {
			this.SetPlayerName(inputplayername);
			System.out.println("┌──────────────────────┐");
			System.out.printf("     %s님, 참가 신청\n     완료되었습니다.\n", this.GetPlayerName());
			System.out.println("└──────────────────────┘");
		}
		while (true) {
			System.out.println("┌──────────────────────┐");
			System.out.println("   KMU 나무키우기 경진대회   ");
			System.out.println("        안 내 서      ");
			System.out.println();
			System.out.println("    참가자 이름 : " + this.GetPlayerName());
			System.out.println("└──────────────────────┘");
			System.out.print("     안내서를 받았다!\n   읽어볼까?(y/n) : ");
			if ((input.next()).charAt(0) == 'y') {
				System.out.println("게임 가이드로 이동합니다.");
				this.GameGuide();
				break;
			} else if ((input.next()).charAt(0) == 'n') {
				System.out.println("게임을 시작합니다.");
				break;
			} else {
				System.out.println("다시 입력해 주세요.");
			}
		}

	}

	public void GameGuide() {
		Tree TREE = new Tree();

		System.out.println("┌──────────────────────────────────────────────────────────────────────────┐");
		System.out.println("                           게 임 스 토 리 및 게 임 방 법");
		System.out.println();
		System.out.println("                  " + this.GetPlayerName() + "은(는) 국민대학교 나무키우기 경진대회에 참가했다.");
		System.out.println("     나무의 성장은 총 10단계로 이루어져 있고, 중간중간에 등장하는 나무와의 대화와");
		System.out.println("     3개의 미니게임을 통해 생명인 나뭇가지와 아이템인 꽃과 열매의 증감이 이루어진다.");
		System.out.println("     아래 그림은 꽃과 열매, 그리고 나뭇가지가 완전하게 모였을 때를 가정해서 그린 성장 그림이다.");
		System.out.println();
		System.out.println(TREE.TreeforGuide1[0]);
		System.out.println();
		System.out.println(TREE.TreeforGuide2[0]);
		System.out.println("           미니게임은 해당 게임이 실행될 때 마다 게임방법이 주어지니 잘 참고하면 된다.");
		System.out.println("   나무와의 대화에는 혼잣말과 질문으로 구성되어 있으며, 혼잣말의 경우에는 아무것도 일어나지 않고");
		System.out.println("   질문은 3~4개의 선택지가 주어지는데, 선택지에 따라 아이템 및 라이프 증감이 일어나니 잘 선택해 보자.");
		System.out.println("└──────────────────────────────────────────────────────────────────────────┘");
	}

}