package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public Object playGame;

	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		Scanner scanner = new Scanner(System.in);
		String mychoice = "";
		//正しい判定ができるまで無限ループ
		while (true) {
			mychoice = scanner.next();
			System.out.println(mychoice);

			if (mychoice.equals("r") || mychoice.equals("s") || mychoice.equals("p")) {
				break;
			} else {
				System.out.println("エラー：入力された値が無効です");

			}

		}

		return mychoice;

	}

	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] opponentChoices = { "r", "s", "p" };
		// 2. 乱数を使って 0, 1, 2 のいずれかの数値を生成する
		// (int)(Math.random() * 3) は、0以上3未満の整数（0, 1, 2）を返します
		int randomNum = (int) (Math.random() * 3);
		String choice = opponentChoices[randomNum];
		System.out.println(choice);
		return choice;

	}

	//じゃんけんを行う
	public void playGame() {
		String me = getMyChoice();
		String you = getRandom();

		// 3. 手の情報を表示するためにHashMapを使う（r→グー と変換するため）
		HashMap<String, String> hands = new HashMap<>();
		hands.put("r", "グー");
		hands.put("s", "チョキ");
		hands.put("p", "パー");

		System.out.println("自分の手は" + hands.get(me) + "相手の手は" + hands.get(you));
	

	// 勝敗の判定を追加
			if (me.equals(you)) {
				System.out.println("あいこです");
			} else if ((me.equals("r") && you.equals("s")) || 
			           (me.equals("s") && you.equals("p")) || 
			           (me.equals("p") && you.equals("r"))) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("自分の負けです");
			}
}
}