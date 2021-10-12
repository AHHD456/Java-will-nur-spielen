
public class simpleTriangle extends GeometricObjekt {
	public simpleTriangle(double w, double h, Vertex pos)
	{
		super(w ,h ,pos );
		
	}
	public simpleTriangle(double w, double h, double x, double y)
	{
		super(w, h, new Vertex(x,y));
		
	}
	@Override public double area()
	{
		return 0.5*width*height;
		
	}
	
	@Override public String toString()
	{
		return "SimpleTriangle("+super.toString()+")";
		
	}
	
	@Override public boolean equals(Object that) {
		
		return (that instanceof simpleTriangle) && super.equals(that);
	}
}
