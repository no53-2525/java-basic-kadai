package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

	//名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName ="一郎";
	}
	//抽象メソッドの実装（@Overrideをつけて親メソッドを上書き）
	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}
