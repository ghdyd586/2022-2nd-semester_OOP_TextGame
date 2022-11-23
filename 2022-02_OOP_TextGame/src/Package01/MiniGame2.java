package Package01;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class MiniGame2 {
	private double mg2score;
	public String usersinger;
	public String usersong;

	String[] SingerList = { "아이유", "뉴진스", "잔나비" };
	String[] SongList = { "strawberrymoon", "attention", "주저하는연인들을위해" };

	PlaceandTreename pt = new PlaceandTreename();

	public void SetScore() {
		this.mg2score = 0;
	}

	public void MG2Guide() {
		while (true) {
			System.out.println("┌───────────────────────────────┐");
			System.out.println("        미 니 게 임 2 가 이 드");
			System.out.println("      가 수 & 노 래 제 목 맞 추 기 \n            게임 방법 ");
			System.out.printf("\n    %s(이)가 노래를 잠깐 흥얼거리면 \n  잽싸게 %s의 노래와 가수를 맞추면 된다!\n", pt.treename, pt.treename);
			System.out.println("      가수는 전부 한글로 적도록 하고, ");
			System.out.println("   노래제목은 영어일 경우 전부 소문자로!\n    그리고 띄어쓰기 없이 쓰도록 하자!");
			System.out.println("  답을 맞추지 못하면 획득 점수가 감소하며  \n        한 번 더 들을 수 있다. ");
			System.out.println("  두번 째 기회에도 맞추지 못할 경우 0점이다.        ");
			System.out.println("      문제는 총 3문제가 주어진다.");
			System.out.println();
			System.out.println();
			System.out.println("  게임을 시작하시려면 y를 입력해 주세요. ");
			System.out.println("└───────────────────────────────┘");
			if ((Main.input.next()).charAt(0) == 'y') {
				this.MG2Loading();
				this.SetScore();
				this.MG2Gameplay1();
				this.MG2Gameplay2();
				this.MG2Gameplay3();
				this.MG2Scoring();
				break;
			} else {
				System.out.println("다시 입력해 주세요.");
			}
		}
	}

	public void MG2Loading() {
		System.out.println("3초 후에 시작합니다.");
		Main.pause.GetPause(1000);
		System.out.println("게임 화면 이동중.");
		Main.pause.GetPause(1000);
		System.out.println("게임 화면 이동중...");
		Main.pause.GetPause(1000);
		System.out.println("게임 화면 이동중.....");

	}

//첫번째문제
	public void MG2Gameplay1() {
		System.out.println("게임 시작!");
		Main.pause.GetPause(500);
		System.out.println("┌────────────────────────┐");
		System.out.printf("   %s : 휘우휘우 ~ ♪\n", pt.treename);
		System.out.println("└────────────────────────┘");
		Main.pause.GetPause(500);
		try {
			this.play1_1();
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		System.out.println("앗 이노래는 ?!");
		System.out.println("┌──────────────┐");
		System.out.print("   가수 : ");
		usersinger = Main.input.next();
		System.out.println("└──────────────┘");
		if (usersinger.equals(SingerList[0])) {
			System.out.printf("%s : 와 ! %s 아는구나 !!\n", pt.treename, usersinger);
			mg2score = mg2score + 10;
		} else {
			System.out.printf("%s : ㅎㅎ헷갈렸구나? \n ", pt.treename);
			try {
				this.play1_2();
				Thread.sleep(4000);
			} catch (Exception e) {

			}
			System.out.println("┌──────────────┐");
			System.out.print("   가수 : ");
			usersinger = Main.input.next();
			System.out.println("└──────────────┘");

			if (usersinger.equals(SingerList[0])) {
				System.out.printf("%s : 와 ! %s 아는구나 !!\n", pt.treename, usersinger);
				mg2score = mg2score + 5;
			} else {
				System.out.printf("%s : 실망이야..\n", pt.treename);
			}
		}

		System.out.println("┌──────────────────────┐");

		System.out.print("   노래 : ");
		usersong = Main.input.next();
		System.out.println("└──────────────────────┘");

		if (usersong.equals(SongList[0])) {
			System.out.printf("%s : 와 ! 이 노래 아는구나 ! 신나 !!\n", pt.treename);
			mg2score = mg2score + 10;
		} else {
			System.out.printf("%s : 딸기가 먹고싶네 ...  \n", pt.treename);
			try {
				this.play1_2();
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			System.out.println("┌──────────────────────┐");
			System.out.print("   노래 : ");
			usersong = Main.input.next();
			System.out.println("└──────────────────────┘");

			if (usersong.equals(SongList[0])) {
				System.out.printf("%s : 역시 ! 이 노래 아는구나 !\n", pt.treename);
				mg2score = mg2score + 5;
			} else {
				System.out.printf("%s : 실망이야..\n", pt.treename);
			}
		}
		System.out.println("현재 점수 : " + mg2score + "점");

	}

// 두번째문제
	public void MG2Gameplay2() {
		Main.pause.GetPause(500);
		System.out.println("┌────────────────────────┐");
		System.out.printf("   %s : 휘우휘우 ~ ♪\n", pt.treename);
		System.out.println("└────────────────────────┘");
		Main.pause.GetPause(500);
		try {
			this.play2_1();
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		System.out.println("앗 이노래는 ?!");
		System.out.println("┌──────────────┐");
		System.out.print("   가수 : ");
		usersinger = Main.input.next();
		System.out.println("└──────────────┘");
		if (usersinger.equals(SingerList[1])) {
			System.out.printf("%s : 와 ! %s 아는구나 !!\n", pt.treename, usersinger);
			mg2score = mg2score + 10;
		} else {
			System.out.printf("%s : ㅎㅎ헷갈렸구나? \n ", pt.treename);
			try {
				this.play2_2();
				Thread.sleep(4000);
			} catch (Exception e) {

			}
			System.out.println("┌──────────────┐");
			System.out.print("   가수 : ");
			usersinger = Main.input.next();
			System.out.println("└──────────────┘");

			if (usersinger.equals(SingerList[1])) {
				System.out.printf("%s : 와 ! %s아는구나 !!\n", pt.treename, usersinger);
				mg2score = mg2score + 5;
			} else {
				System.out.printf("%s : 실망이야..\n", pt.treename);
			}
		}

		System.out.println("┌──────────────────────┐");

		System.out.println("   노래 : ");
		usersong = Main.input.next();
		System.out.println("└──────────────────────┘");

		if (usersong.equals(SongList[1])) {
			System.out.printf("%s : 어텐셔어어어어언~~~~\n", pt.treename);
			mg2score = mg2score + 10;
		} else {
			System.out.printf("%s : 넌 내 관심을 끌었어 ~!@@  \n", pt.treename);
			try {
				this.play2_2();
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			System.out.println("┌──────────────────────┐");
			System.out.print("   노래 : ");
			usersong = Main.input.next();
			System.out.println("└──────────────────────┘");

			if (usersong.equals(SongList[1])) {
				System.out.printf("%s : 역시 ! 너라면 알 줄 알았어 !\n", pt.treename);
				mg2score = mg2score + 5;
			} else {
				System.out.printf("%s : 실망이야..\n", pt.treename);
			}
		}
		System.out.println("현재 점수 : " + mg2score + "점");

	}

//세번째 문제
	public void MG2Gameplay3() {
		Main.pause.GetPause(500);
		System.out.println("┌────────────────────────┐");
		System.out.printf("   %s : 휘우휘우 ~ ♪\n", pt.treename);
		System.out.println("└────────────────────────┘");
		Main.pause.GetPause(500);
		try {
			this.play3_1();
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		System.out.println("앗 이노래는 ?!");
		System.out.println("┌──────────────┐");
		System.out.print("   가수 : ");
		usersinger = Main.input.next();
		System.out.println("└──────────────┘");
		if (usersinger.equals(SingerList[2])) {
			System.out.printf("%s : 와 ! %s아는구나 !!\n", pt.treename, usersinger);
			mg2score = mg2score + 10;
		} else {
			System.out.printf("%s : 원숭이들은 음악을 참 잘해 \n ", pt.treename);
			try {
				this.play3_2();
				Thread.sleep(4000);
			} catch (Exception e) {

			}
			System.out.println("┌──────────────┐");
			System.out.print("   가수 : ");
			usersinger = Main.input.next();
			System.out.println("└──────────────┘");

			if (usersinger.equals(SingerList[2])) {
				System.out.printf("%s : 와 ! %s 아는구나 !!\n", pt.treename, usersinger);
				mg2score = mg2score + 5;
			} else {
				System.out.printf("%s : 실망이야..\n", pt.treename);
			}
		}

		System.out.println("┌──────────────────────┐");

		System.out.print("   노래 : ");
		usersong = Main.input.next();
		System.out.println("└──────────────────────┘");

		if (usersong.equals(SongList[2])) {
			System.out.printf("%s : 그러다 ~ 밤이 찾아오면 ~~ \n", pt.treename);
			mg2score = mg2score + 10;
		} else {
			System.out.printf("%s : 연인들은 항상 그러더라구  \n", pt.treename);
			try {
				this.play3_2();
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			System.out.println("┌──────────────────────┐");
			System.out.print("   노래 : ");
			usersong = Main.input.next();
			System.out.println("└──────────────────────┘");

			if (usersong.equals(SongList[2])) {
				System.out.printf("%s : 역시 ! 이 노래 아는구나 !\n", pt.treename);
				mg2score = mg2score + 5;
			} else {
				System.out.printf("%s : 실망이야..\n", pt.treename);
			}
		}
	}

	public void MG2Scoring() {
		if (pt.place.equals("브라질")) {
			mg2score = mg2score + (mg2score / 10);
			System.out.println("┌───────────────────────────────────────────┐");
			System.out.println("  브라질은 식물의 파라다이스야 ! (미니게임 추가점수 +10%)");
			System.out.println("             최종점수 : " + mg2score + "점");
			System.out.println("└───────────────────────────────────────────┘");

		} else if (pt.place.equals("한국")) {
			mg2score = mg2score + (mg2score / 20);
			System.out.println("┌───────────────────────────────────────────────────┐");
			System.out.println("   사계절 한국은 나무가 자라기 좋은 환경이지 (미니게임 추가점수 +5%)");
			System.out.println("                 최종점수 : " + mg2score + "점");
			System.out.println("└───────────────────────────────────────────────────┘");

		} else if (pt.place.equals("러시아")) {
			System.out.println("┌───────────────────────────────────────────────────┐");
			System.out.println("                최종점수 : " + mg2score + "점");
			System.out.println("└───────────────────────────────────────────────────┘");

		}
		System.out.println("미니게임2를 종료합니다.");
	}

	// 노래 재생 메소드들
	public void play1_1() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;

		bgm = new File("C:\\treesongs\\iu1.wav");

		Clip clip;

		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();

		} catch (Exception e) {

		}

	}

	public void play1_2() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;

		bgm = new File("C:\\treesongs\\iu2.wav");
		Clip clip;

		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();

		} catch (Exception e) {

		}

	}

	public void play2_1() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;

		bgm = new File("C:\\treesongs\\newjeans1.wav");
		Clip clip;

		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();

		} catch (Exception e) {

		}

	}

	public void play2_2() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;

		bgm = new File("C:\\treesongs\\newjeans2.wav");
		Clip clip;

		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();

		} catch (Exception e) {

		}

	}

	public void play3_1() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;

		bgm = new File("C:\\treesongs\\jannabi1.wav");

		Clip clip;

		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();

		} catch (Exception e) {

		}

	}

	public void play3_2() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;

		bgm = new File("C:\\treesongs\\jannabi2.wav");

		Clip clip;

		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();

		} catch (Exception e) {

		}

	}

}
