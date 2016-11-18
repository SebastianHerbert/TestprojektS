import javax.swing.Spring;

public class FSpring {
	
	protected Spring parent;

	protected double fraction;
	  
	public FSpring(Spring p, double f) {
	    if (p == null) {
	      throw new NullPointerException("Parent spring cannot be null");
	    }
	    parent = p;
	    fraction = f;
	  }
	
	
	public static FSpring half(Spring s) {
		    return new FSpring(s, 0.5);
		  }
}
