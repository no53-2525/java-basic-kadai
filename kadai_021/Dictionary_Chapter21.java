package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> fruit = new HashMap<String, String>();
	
	public Dictionary_Chapter21() {
		fruit.put("apple", "りんご");
		fruit.put("peach", "桃");
		fruit.put("banana", "バナナ");
		fruit.put("lemon", "レモン");
		fruit.put("pear", "梨");
		fruit.put("kiwi", "キウイ");
		fruit.put("strawberry", "いちご");
		fruit.put("grape", "ぶどう");
		fruit.put("muscat", "マスカット");
		fruit.put("cherry", "さくらんぼ");
		
	}
	
	public void searchWords(String[] searchWords) {
		for(int i =0; i <searchWords.length; i++) {
			String word = searchWords[i];
			if(fruit.containsKey(word)) {
				System.out.println(word+"の意味は"+fruit.get(word));
			}else {
				System.out.println(word+"は辞書に存在しません");
			}
		}
		
	}
}
