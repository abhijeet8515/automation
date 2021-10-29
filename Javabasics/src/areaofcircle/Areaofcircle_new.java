package areaofcircle;

public class Areaofcircle_new {
	
    static double pi=3.14;
    double radius=15;
    public double areaofcircle() {                                            //double radius=15;
    	double area = pi*radius*radius;
    	return area;	                                                  //System.out.println("area of circle"+area);
    }
    static public void radius(int r) {
    	System.out.println("hi");
    	return;
    }
	public static void main(String[] args) {
     //double r=10;
		double res;
		Areaofcircle_new circle=new Areaofcircle_new();
		res=circle.areaofcircle();
		System.out.println("areaofcircle"+res);
	}

}
