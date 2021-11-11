package sec05.exam12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {

		Date n1 = new Date();
		System.out.println(n1);
		
		SimpleDateFormat a = new SimpleDateFormat("yyyy-MM,dd: hh-mm-ss");
		String at = a.format(n1);
		System.out.println(at);
		
		Calendar ttt = Calendar.getInstance();
		
		System.out.println(ttt.get(Calendar.YEAR));
		System.out.println((ttt.get(Calendar.MONTH)+1));
		
	}

}
