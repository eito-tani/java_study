package text.section_11;

public class WhileSyntax_3 {

	public static void main(String[] args) {
		
		int dice = 1;
		int sum = 0;
		
		// 出た目の合計が10に達するまでサイコロを振り続ける
		while(sum < 10) {
			
			// サイコロを振る
			dice = (int)(Math.ceil(Math.random() * 6));
			System.out.println("サイコロの和は" + dice);
			
			// 出た目が4の場合は加算せず次のループへすすむ
				if(dice == 4) {
					System.out.println("4は加算しません");
					continue;
				}
				
			// 出た目を変数sumに加算
				sum += dice;
				System.out.println(dice + "を加算：現在の合計は" + sum);
			
		}

	}

}
