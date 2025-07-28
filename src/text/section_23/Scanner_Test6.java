package text.section_23;

import java.util.Scanner;

public class Scanner_Test6 {

	public static void main(String[] args) {
		System.out.println("入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		//「,(カンマ)」を区切り文字として指定する
		scanner.useDelimiter(",");

		String input = scanner.next();
		
		System.out.println(input);
		
		scanner.close();
	}

}
