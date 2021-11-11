package sec05.exam15;

import java.text.MessageFormat;

public class MessageFormatEx {

	public static void main(String[] args) {

		String id = "java";
		String name = "홍길동";
		String tel = "010-555-5555";
		
		String t1 = "회원 아이디 : {0} \n회원 이름 : {1}\n회원 전화 : {2}";
		
		String a = MessageFormat.format(t1, id,name,tel);
		System.out.println(a);
		
	}

}
