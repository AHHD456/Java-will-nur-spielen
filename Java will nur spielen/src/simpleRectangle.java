
public class simpleRectangle extends GeometricObjekt {
	

	public simpleRectangle(double w, double h, Vertex pos)
	{
		super(w ,h ,pos );
		
	}
	public simpleRectangle(double w, double h, double x, double y)
	{
		super(w, h, new Vertex(x,y));
		
	}
	@Override public double area()
	{
		return width*height;
		
	}
	
	@Override public String toString()
	{
		return "SimpleRectangle("+super.toString()+")";
		
	}
	
	@Override public boolean equals(Object that) {
		
		return (that instanceof simpleRectangle) && super.equals(that);
	}
	
}
