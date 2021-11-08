package sec05.exam04;

public class ToLowerUpperCase {

	public static void main(String[] args) {

		String a1 = "aaa";
		String a2 = "AAA";
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a2.toLowerCase()));
		System.out.println(a1.equalsIgnoreCase(a2));
		
		
	}

}
