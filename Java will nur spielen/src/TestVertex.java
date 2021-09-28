import java.util.Scanner;

public class TestVertex {

	public static void main(String[] args) {

		byte vertex;

		Vertex v1 = new Vertex(17, 4);
		Vertex v2 = new Vertex(42, 0);
		Vertex v3 = v1.skalarMult(42.42);
		
		
		
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Welche Vertex Infos willst du?");
		vertex = eingabe.nextByte();

		

		if (vertex == 1) {
			System.out.println(v1);
			System.out.println(v1.length());
		}
		if (vertex == 2) {
			System.out.println(v2);
			System.out.println(v2.length());
		}
		if (vertex == 3) {
			System.out.println(v3);
			System.out.println(v3.length());
		}

		// hazweisieben();
		// EntfernungUrsprung();

	}
	/*
	 * public static void hazweisieben() {
	 * 
	 * System.out.println(("a"+ 1)+2); System.out.println("a"+(1+2));
	 * 
	 * 
	 * 
	 * }
	 * 
	 * public static void EntfernungUrsprung() {
	 * 
	 * 
	 * double EntfUr ;
	 * 
	 * EntfUr = Math.sqrt(v1.x*v1.x+v1.y*v1.y); System.out.println(EntfUr);
	 * 
	 * }
	 */
}
