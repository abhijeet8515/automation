package Nonstatic;

public class Method1 {
    
	static void addtwonum(int a,int b) {
	int res=a+b;
	System.out.println("a"+a);
    System.out.println("b"+b);
    System.out.println("res"+res);
	}
	public static void main(String[] args) {
    int x=10,y=20,res;
    res=x+y;
    System.out.println("x"+x);
    System.out.println("y"+y);
    System.out.println("res"+res);
    
    
    Method1.addtwonum(10,20); 
    Method1.addtwonum(20,30);
    Method1.addtwonum(30,40);
    Method1.addtwonum(60,70);
    Method1.addtwonum(70,80);
;   
    
    
    
    
 	}

}
