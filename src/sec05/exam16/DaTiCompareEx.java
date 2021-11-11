package sec05.exam16;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DaTiCompareEx {

	public static void main(String[] args) {

		LocalDateTime a1 = LocalDateTime.of(2021, 12, 25, 16,25, 30);
		LocalDateTime a2 = LocalDateTime.of(2023, 12, 3, 10, 15, 6);
		
		System.out.println(a1);
		System.out.println(a2);
		
		if(a1.isBefore(a2)) {
			System.out.println("a1빠름");
		}else if(a1.isEqual(a2)) {
			System.out.println("같음");
		}else if(a1.isAfter(a2)) {
			System.out.println("a1늦음");
		}
		
		long cy = a1.until(a2, ChronoUnit.YEARS);
		long cm = a1.until(a2, ChronoUnit.MONTHS);
		long cd = a1.until(a2, ChronoUnit.DAYS);
		System.out.println(cy);
		System.out.println(cm);
		System.out.println(cd);
		
		cy = ChronoUnit.YEARS.between(a1, a2);
		System.out.println(cy);
	}

}
