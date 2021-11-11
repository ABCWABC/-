package sec05.exam16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class TCompareEx {

	public static void main(String[] args) {

		LocalDate a = LocalDate.of(2025, 3, 16);
		LocalDate b = LocalDate.of(2020, 1, 4);
		System.out.println(a);
		
		LocalDateTime a2 = LocalDateTime.now();
		LocalDateTime b2 = LocalDateTime.of(2027, 12, 17, 16, 5, 5);
		
		Period w = Period.between(a2.toLocalDate(), b2.toLocalDate());
		System.out.println(a2);
		System.out.println(b2);
		System.out.println(w);
	}

}
