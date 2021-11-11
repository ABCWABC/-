package sec05.exam15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeEx2 {

	public static void main(String[] args) {

		LocalDateTime a1 = LocalDateTime.now();
		System.out.println(a1);
		
		System.out.println(a1.getYear());
		System.out.println(a1.getMonthValue());
		System.out.println(a1.getMonth());
		System.out.println(a1.getDayOfWeek());
		System.out.println(a1.getHour());
		System.out.println(a1.getMinute());
		System.out.println(a1.getSecond());
		System.out.println(a1.getNano());
		System.out.println();
		
		LocalDate a2 = a1.toLocalDate();
		System.out.println(a2);
		LocalTime a3 = a1.toLocalTime();
		System.out.println(a3);
		
		if(a2.isLeapYear()) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
	}

}
