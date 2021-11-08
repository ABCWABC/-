package sec05.exam04;

public class ByteToString {

	public static void main(String[] args) {

		byte[] b = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(b);
		System.out.println(str1);
		String str2 = new String(b, 6, 4);
		System.out.println(str2);
	}

}
