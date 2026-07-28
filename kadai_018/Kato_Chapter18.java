package kadai_018;

public abstract class Kato_Chapter18 {

	//性を表すフィールド
	String familyName = "加藤";

	//名を表すフィールド
	String givenName;

	//住所を表すフィールド
	String address = "東京都中野区〇×";

	// 共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName +this.givenName + "です");
		System.out.println("住所は" + this.address + "です");

	}

	//個別の紹介を出力するメソッド
	public abstract void eachIntroduce();

	// 紹介を実行するメソッド
	public void  execIntroduce() {
		this.commonIntroduce(); //共通の紹介を呼び出す
		this.eachIntroduce(); //個別の紹介を呼び出す
		System.out.println();  //見やすくするために1行改行
	}

	//出力メソッド
	public void output(String familyName, String givenName, String address) {
		System.out.println(familyName);
		System.out.println(givenName);
		System.out.println(address);

	}

}
