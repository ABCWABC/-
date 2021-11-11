package sec05.exam16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DTParsingEx {

	public static void main(String[] args) {

		DateTimeFormatter a,a3;
		LocalDate b,b2,b3;
		
		b = LocalDate.parse("1994-07-13");
		System.out.println(b);
		
		a = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(a);
		
		b2 = LocalDate.parse("1994-07-13",a);
		System.out.println(b2);
		
		a3 = DateTimeFormatter.ofPattern("yyyy!MM@dd");
		b3 = LocalDate.parse("1994/07/13",a3);
		System.out.println(b3);
	}

}
