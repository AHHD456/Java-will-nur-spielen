
public class GeometricObjekt {

	public Vertex pos;
	public double height;
	public double width;

	public GeometricObjekt( double width, double height, Vertex pos) {
		this.pos = pos;
		this.height = height;
		this.width = width;

		if (width < 0) {
			width = -width;
			pos.x = pos.x - width;
		}

		if (height < 0) {
			height = -height;
			pos.y = pos.y - height;
		}

	}

	public GeometricObjekt(double width, double height) {
		this( height, width, new Vertex(0, 0));

	}

	public GeometricObjekt(double k) {
		this(k, k);
	}

	public GeometricObjekt() {
		this(10);
	}

	public GeometricObjekt(Vertex pos) {
		this( 0, 0, pos);

	}

	public String toString() {

		return "width=" + width + "  height=" + height + " pos=" + pos;
	}

	public double circumference() {
		return 2 * (width + height);
	}

	public double area() {
		return width * height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public Vertex getPos() {
		return pos;
	}

	public boolean contains(Vertex v) {

		if (v.x >= pos.x && v.x <= pos.x + width) {

			if (v.y >= pos.y && v.y <= pos.y + height) {

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public boolean isLargerThan(GeometricObjekt that) {

		return this.area() > that.area();

	}

	public void moveTo(Vertex pos) {
		this.pos = pos;
	}

	public void moveTo(double x, double y) {
		moveTo(new Vertex(x, y));
	}

	public void move(Vertex v) {
		moveTo(pos.add(v));
	}

	public boolean equals(Object thatObject) {
		if (thatObject instanceof GeometricObjekt) {
			GeometricObjekt that = (GeometricObjekt)thatObject;
			return that.width==this.width && that.height==that.height && this.pos.equals(that.pos);
		} else {
			return false;
		}
	}
	
   //public boolean inout(d) {
	   
	 // i
	   
   //} 
}
	
	
	
	
	
	
	
	
	
	
	

