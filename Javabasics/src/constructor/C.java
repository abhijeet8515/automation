package constructor;
class A{
   A(int a){
		System.out.println("class a="+a);
   }
}
class B extends A{
	B(int b){
		super(50);
	System.out.println(b);
	}
}
public class C {

	public static void main(String[] args) {
		B j1=new B(20);
   	}

}
