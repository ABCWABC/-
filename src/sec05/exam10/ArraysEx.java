package sec05.exam10;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {

		char[] arr1 = {'j','a','v','a'};
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 1, arr4, 1, arr1.length-2);
		System.out.println(Arrays.toString(arr4));
	}

}
