package sec05.exam03;

public class SystemTimeExample {

	public static void main(String[] args) {

		long time1 = System.nanoTime();
		
		System.out.println(time1);
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += 1;
		}
		long time2 = System.nanoTime();
		
		System.out.println(sum);
		System.out.println(time2-time1);
	}

}
