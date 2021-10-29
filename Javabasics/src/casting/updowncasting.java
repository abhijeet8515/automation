package casting;
class method {
	 method(int a){
		 
		 System.out.println("method constructor call"+a);
	 }
	public void display() {
		System.out.println("it is method");
	}
	public void addition () {
	    int a=10,b=20,c=a+b;
   	int add=c;
		System.out.println("addition is="+add);
	}
}
class reaction extends method{
	 reaction (int  b){
		 super(27);
		 System.out.println("reaction constructor call"+b);
	 }
	public void display() {
		 System.out.println("is it reaction");	 }
		public void substraction() {
			 int a=30,b=20,c=a-b;
				int sub=c;
			 System.out.println("subtraction is="+sub);
		 }
	 }
	 class satisfaction extends reaction{
		 satisfaction(int c){
			 super(34);
		 System.out.println("satisfaction constructor call"+c);
		 }
		public void display() {
		 System.out.println("it is satisfaction");
}
		public void multiplication() {
			 int a=10,b=20,c=a*b;
				int multi=c;
			 System.out.println("multiplication is="+multi);
    }
		public void dividation() {
			 int a=40,b=20,c=a/b;
				int div=c;
			 System.out.println("dividation is="+div);
    }
}
public class updowncasting {

	public static void main(String[] args) {
		satisfaction j1 =new satisfaction(10);//implicit upcasting
		j1.display();
		j1.addition();
		j1.substraction();
		j1.multiplication();
		j1.dividation();
		 System.out.println("................................");

		reaction j2=(reaction)j1;//explicit downcasting
		j2.substraction();
		j2.display();
		 System.out.println("................................");

		method j3=(reaction)j2;//explicit downcasting
		j3.addition();
		j3.display();
		 System.out.println("................................");

		method j4=(method)j1;//explicit downcasting
		j4.display();
		j4.addition();
		 System.out.println("................................");
		satisfaction j5=j1;//implicit upcasting
		j5.addition();
		j5.display();
		j5.substraction();
		j5.multiplication();
		j5.dividation();
   }	
}

		


	 

