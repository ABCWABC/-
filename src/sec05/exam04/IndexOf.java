package sec05.exam04;

public class IndexOf {

	public static void main(String[] args) {

		String a = "자바 프로그래밍";
		
		int l = a.indexOf("프로그래밍");
		System.out.println(l);
		
		if(a.indexOf("자바") != -1) {
			System.out.println("자자바바");
		}else {
			System.out.println("노상관");
		}
	}

}
