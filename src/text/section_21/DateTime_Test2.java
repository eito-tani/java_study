package text.section_21;

import java.util.Calendar;
import java.util.Date;

public class DateTime_Test2 {

	public static void main(String[] args) {
		//現在日時を取得する
		Date date = new Date();
		
		//Calenderクラスのオブジェクトを生成する
		Calendar calendar =Calendar.getInstance();

		//Dateクラスで日時を設定する
		calendar.setTime(date);
		
		//任意の年月日を取得して、出力する
		System.out.println("年は" + calendar.get(calendar.YEAR));
		//Calenderクラスの月は0から始まるので、実行結果の１は2月を示します
		System.out.println("月は" + calendar.get(calendar.MONTH));
		System.out.println("日は" + calendar.get(calendar.DATE));
		
		//任意の時分秒を取得して、出力する
		System.out.println("時間は"+calendar.get(Calendar.HOUR));
		System.out.println("分は"+calendar.get(Calendar.MINUTE));
		System.out.println("秒は"+calendar.get(Calendar.SECOND));
	}

}
