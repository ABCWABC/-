package sec05.exam16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatEx {

	public static void main(String[] args) {

		LocalDateTime a = LocalDateTime.now();
		DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a - E요일");
		
		System.out.println(a.format(b));
	}

}
