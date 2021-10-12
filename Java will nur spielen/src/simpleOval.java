
public class simpleOval extends GeometricObjekt{

	public simpleOval(double w, double h, Vertex pos)
	{
		super(w ,h ,pos );
		
	}
	public simpleOval(double w, double h, double x, double y)
	{
		super(w, h, new Vertex(x,y));
		
	}
	@Override public double area()
	{
		return Math.PI*width*height;
		
	}
	
	@Override public String toString()
	{
		return "SimpleOval("+super.toString()+")";
		
	}
	
	@Override public boolean equals(Object that) {
		
		return (that instanceof simpleOval) && super.equals(that);
	}
}
