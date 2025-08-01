package text.section_11;

public class WhileSyntax_4 {

	public static void main(String[] args) {
        
		int dice = 1; // サイコロの目

        // 1が出るまでサイコロを振り続ける(while文)
        while( dice != 1 ) {
            // サイコロを振る(1～6の目をランダムで生成)
            dice = (int)( Math.ceil( Math.random() * 6 ) );
            System.out.println("[while]サイコロの目は" + dice);
        }
        
        // 1が出るまでサイコロを振り続ける
        do {
        	//　サイコロをふる
        	dice = (int)(Math.ceil(Math.random() * 6));
        	System.out.println("[do-while]サイコロの目は" + dice);
        } while(dice != 1);
        
	}

}
