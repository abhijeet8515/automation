package methodoverloading;

public class A {
	int add() {
 //  void add(){
   int a=10,b=20,c;
   c=a+b;
   return c ;
  // System.out.println(c);
}
   void add(int x,int y){
   int c;
   c=x+y;
   System.out.println(c);
}
   void add(double x,int y){
	   double c;
	   c=x+y;
	   System.out.println(c);
	}
	public static void main(String[] args) {
		A r=new A();
		int c=r.add();
        System.out.println(c);
	//	r.add();
		r.add(100,200);
		r.add(200,300);
	}
}
