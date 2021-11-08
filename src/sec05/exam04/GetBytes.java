package sec05.exam04;

public class GetBytes {

	public static void main(String[] args) {

		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		String a = new String(bytes1);
		System.out.println(a);
	}

}
