
public class TestVertex {

	public static void main(String[] args) {

		
		GeometricObjekt o1 = new GeometricObjekt(17,4, new Vertex(42,23));
		GeometricObjekt o2 = new GeometricObjekt(17,4);
		GeometricObjekt o3 = new GeometricObjekt(17);
		GeometricObjekt o4 = new GeometricObjekt();
		Vertex v1 = new Vertex(13,24);
		
		System.out.println(o1.equals(o2));
		System.out.println(o4);
		System.out.println(o3.contains(v1));
		
		
		
		
		
		
		
}
	}
 



