
/**
 * Cylinder mesh calculator. Generic cylinder mesh available along with
 * specified dimensions. No elliptical meshes. Generic meshes are in the "other"
 * class...
 * 
 * @author pietas
 *
 */
public class CylinderMesh {

	private static final int STANDARD_DIVISIONS = 64;
	private static final double STANDARD_HEIGHT = 3.0;
	private static final double STANDARD_RADIUS = 1.0;

	private static int actualDivisions = STANDARD_DIVISIONS;
	private static double actualHeight = STANDARD_HEIGHT;
	private static double actualRadius = STANDARD_RADIUS;

	/**
	 * Fallback constructor when no dimensions given.
	 */
	public CylinderMesh() {
		this(STANDARD_DIVISIONS, STANDARD_HEIGHT, STANDARD_RADIUS);
	}

	public CylinderMesh(double height, double radius) {
		this(STANDARD_DIVISIONS, height, radius);
	}

	public CylinderMesh(int divisions, double height, double radius) {
		actualDivisions = divisions;
		actualHeight = height;
		actualRadius = radius;

		constructCylinder();
	}

	public void constructCylinder() {
		constructTopCap();
		constructBottomCap();
		constructBody();
	}
	
	private void constructTopCap(){
		
	}
	
	private void constructBottomCap(){
		
	}
	
	private void constructBody(){
		
	}
}
