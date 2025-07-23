package text.section_05;

public class Variable_6 {

	public static void main(String[] args) {
		
		final double PI = 3.14159;
		double cicleArea = 0, circumference = 0;
		int radius = 5;
		
		//	円の面積
		cicleArea = PI * radius * radius;
		System.out.println(cicleArea);
		
		// 円周
		circumference = PI * (radius * 2);
		System.out.println(circumference);

	}

}
