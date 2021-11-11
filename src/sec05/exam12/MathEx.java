package sec05.exam12;

public class MathEx {

	public static void main(String[] args) {

		int v1 = Math.abs(-50);
		System.out.println(v1);
		
		System.out.println(Math.ceil(5.1));
		System.out.println(Math.floor(5.1));
		System.out.println(Math.max(5.1,2));
		System.out.println((int)Math.min(5.0,2));
		System.out.println((int)(Math.random()*10));
		System.out.println(Math.rint(5.49));
		System.out.println((double)Math.round(5.78));
		
		
		for(int i=0; i<10; i++) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num+" "+num);
		}
	}

}
