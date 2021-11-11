package sec05.exam15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeEx3 {

	public static void main(String[] args) {

		LocalDateTime a1 = LocalDateTime.now();
		System.out.println(a1);
		
		LocalDateTime b1 = a1.minusYears(2)
				.minusDays(16);
		System.out.println(b1);
		
		LocalDate a2 = LocalDate.now();
		System.out.println(a2);
		
		LocalDate b2 = a2
				.withYear(1962)
				.withMonth(3)
				.withDayOfMonth(12);
		System.out.println(b2);
		
		LocalDateTime b3 = a1.with(TemporalAdjusters.firstDayOfYear());
		System.out.println(b3);
		LocalDateTime b4 = a1.with(TemporalAdjusters.lastDayOfYear());
		System.out.println(b4);
	}

}
