
public class TestVertex {

	public static void main(String[] args) {

		
		GeometricObjekt o1 = new GeometricObjekt(new Vertex(42,23),4, 17);
		
		GeometricObjekt o2 = new GeometricObjekt(17,4);
		GeometricObjekt o3 = new GeometricObjekt(17);
		GeometricObjekt o4 = new GeometricObjekt();
		
		System.out.println(o1.equals(o2));
		System.out.println(o4);
		System.out.println(o3.contains(new Vertex(10,3)));
		
		
		
		
		
		
		
}
	}




