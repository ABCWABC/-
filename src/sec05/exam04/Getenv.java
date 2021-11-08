package sec05.exam04;

public class Getenv {

	public static void main(String[] args) {

		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
	}

}
