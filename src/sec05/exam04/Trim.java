package sec05.exam04;

public class Trim {

	public static void main(String[] args) {

		String a = "    02";
		String b = "123   ";
		String c = "     1234    ";
		
		String t = a.trim() + b.trim() + c.trim();
		System.out.println(t);
	}

}
