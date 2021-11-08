package sec05.exam04;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {

		String text = "홍길동&이수홍,박연수,김자바-회명호";
		String[] a = text.split("&|,");
		
		System.out.println(Arrays.toString(a));
		
		StringTokenizer to = new StringTokenizer(text, "&|,|-");
		
		int n = to.countTokens();
		
		for(int i=0; i<n; i++) {
			System.out.println(to.countTokens());
			System.out.println(to.nextToken());
		}
		
	}

}
