package Javamethods;

public class Method0 {
    static void addtwonum(int a,int b) {
     int res=a+b;
     System.out.println("a  :"+a);
     System.out.println("b  :"+b);
     System.out.println("res  :"+res);
    }
	public static void main(String[] args) {
     int x=10,y=20,res;
     res=x+y;
     System.out.println("x  :"+x);
     System.out.println("y  :"+y);
     System.out.println("res  :"+res);
		
     x=100;
     y=200;
     res=x+y;
     System.out.println("x  :"+x);
     System.out.println("y  :"+y);
     System.out.println("res  :"+res);
		
	 x=101;
     y=202;
	 res=x+y;
	 System.out.println("x  :"+x);
     System.out.println("y  :"+y);
     System.out.println("res  :"+res);
	
	 x=105;
	 y=208;
	 res=x+y;
	 System.out.println("x  :"+x);
	 System.out.println("y  :"+y);
	 System.out.println("res  :"+res);
		
	 Method0.addtwonum(10,20);
	 Method0.addtwonum(100,120);
	 Method0.addtwonum(110,2);
	 Method0.addtwonum(1,20);
	}

}
