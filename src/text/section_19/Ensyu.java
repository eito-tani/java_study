package text.section_19;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ensyu {

	public static void main(String[] args) {
		
		// 果物のコレクション
		List<String> fruits = Arrays.asList(
		        "りんご", "ぶどう", "バナナ", "レモン", "いちご",
		        "りんご", "いちご", "ぶどう", "ぶどう", "りんご",
		        "バナナ", "いちご", "ぶどう", "いちご", "ぶどう");
		
		HashMap<String,Integer> fruitsMap = new HashMap<String,Integer>();
		
		for(String fruit :fruits) {
			if(fruitsMap.get(fruit) == null) {
				fruitsMap.put(fruit,1);
			}else {
				fruitsMap.put(fruit,fruitsMap.get(fruit) + 1);
			}
		}
		
        // 出力処理
        for (String fruit : fruitsMap.keySet()) {
            System.out.println(fruit + "：" + fruitsMap.get(fruit) + "回");
        }

	}

}
