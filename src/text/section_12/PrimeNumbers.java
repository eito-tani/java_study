package text.section_12;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		// 配列を生成
		boolean[] numbers = new boolean[101];
		
		// 配列を初期化
		for(int  i = 2; i < numbers.length; i++) {
			numbers[i] = true;
		}
		
		// 素数判定
		int divide = 2;
		while(divide < numbers.length) {
			for(int i = divide + 1; i < numbers.length; i++) {
				if (i% divide == 0) {
					numbers[i] =false;
				}
			}
			divide++;
		}
		
		// 素数の出力
		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i]) {
				System.out.println(i);
			}
		}
		

	}

}
