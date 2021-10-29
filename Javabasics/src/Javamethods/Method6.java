package Javamethods;

public class Method6 {
	 static double pi=3.14;
	    double radius=15;
	    
	    public double areaofcircle() {
	    	//double radius=15;
	    	double area = pi*radius*radius;
	    	return area;
	    	//System.out.println("area of circle"+area);
	    }
	    static public void radius(int r) {
	    	System.out.println("hi");
	    	return;
	    }
		public static void main(String[] args) {
	     Method6 circle=new Method6();
	     circle.areaofcircle();
	    System.out.println("area of circle"+circle.areaofcircle());


	}

}
