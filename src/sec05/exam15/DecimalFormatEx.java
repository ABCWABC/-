package sec05.exam15;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {

		double n1 = -1234.56;
		
		DecimalFormat de1 = new DecimalFormat("0.0000;---0.0000");
		System.out.println(de1.format(n1));
	}

}
