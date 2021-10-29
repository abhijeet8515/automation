package areaofcircle;

public class Areacircle {
    public static void areaofcircle(double pi,int r) {
	    double res=pi*r*r;
	    System.out.println("area of circle is     "+res);
    }
    
    public static double areaofcircle1(double pi,int r) {
	    double res1=pi*r*r;
	    return res1;
    }  
    
	public static void main(String[] args) {
       Areacircle.areaofcircle(3.14,15);

       double res1=Areacircle.areaofcircle1(3.14, 15);
	   System.out.println("area of circle is     "+Areacircle.areaofcircle1(3.14,15));

	}

}
