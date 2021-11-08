package sec05.exam04;

public class Builer {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("프로그램");
		
		System.out.println(sb.toString());
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 8, "북");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());

		System.out.println(sb.length());
		System.out.println(sb.toString());
	}

}
