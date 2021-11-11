package sec05.exam15;

import java.time.*;
import java.time.temporal.ChronoUnit;

import org.omg.PortableServer.THREAD_POLICY_ID;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.ZonedDateTime;

public class DateTimeEx {

	public static void main(String[] args) {

		LocalDate a1 = LocalDate.now();
		System.out.println(a1);
		
		LocalDate a2 = LocalDate.of(2024, 5, 10);
		System.out.println(a2);
		
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		
		LocalTime t2 = LocalTime.of(18, 25, 9);
		System.out.println(t2);
		
		LocalDateTime at1 = LocalDateTime.now();
		System.out.println(at1);
		
		LocalDateTime at2 = LocalDateTime.of(21, 7, 13, 18, 10, 25);
		System.out.println(at2);
		
		ZonedDateTime z1 = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(z1);
		
		Instant i1 = Instant.now();
		System.out.println("i1 : "+i1);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant i2 = Instant.now();
		System.out.println(i2);
		
		if(i1.isBefore(i2)) {
			System.out.println("1 early");
		}else {
			System.out.println("1 later");
		}
		System.out.println(i1.until(i2, ChronoUnit.NANOS));
		
	}

}
