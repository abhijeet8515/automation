package areaofcircle;


public class circle {

	  public static void areaofcircle() {
		     double pi=3.14;
		     int r=16;
			 double res=pi*r*r;
      System.out.println("area of circle is     "+res);
		    }
		    
		    public static double areaofcircle1() {
		    	 double pi=3.14;
			     int r=16;
			    double res1=pi*r*r;
			    return res1;
		    }  
		    
			public static void main(String[] args) {
		       circle.areaofcircle();

		       double res1=circle.areaofcircle1();
			   System.out.println("area of circle is     "+circle.areaofcircle1());
	}

}
